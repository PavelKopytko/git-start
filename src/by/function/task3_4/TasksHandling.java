package by.function.task3_4;

import java.util.*;
import java.util.function.Supplier;

class TaskManager {
    /**
     * Highest priority queues come first in the list.
     * The 0th queue contains tasks with the highest priority.
     */
    private final List<Queue<Task>> taskQueues = new ArrayList<>();

    public TaskManager(int numberOfQueues) {
        if (numberOfQueues < 1) {
            throw new IllegalArgumentException("The number of queues must be >= 1");
        }
        for (int i = 0; i < numberOfQueues; i++) {
            taskQueues.add(new ArrayDeque<>());
        }
    }

    public void add(Task task, int priority) {
        if (priority < 0 || priority >= taskQueues.size()) {
            throw new IllegalArgumentException("The task has an illegal priority " + priority);
        }
        taskQueues.get(priority).add(task);
    }

    public List<Queue<Task>> getTaskQueues() {
        return taskQueues;
    }

    /**
     * Returns a supplier to access tasks in the right order according to their priority.
     * If all the queues are empty, it returns null.
     */
    public Supplier<Task> getTaskSupplier() {
        return () ->    {
            Task task = null;
            for (int i = 0; i < taskQueues.size(); i++) {
                Queue<Task> taskQueue = taskQueues.get(i);
                if (!taskQueue.isEmpty()) {
                    task = taskQueue.poll();
                    break;
                }
            }
            return task;
        }; // write your code here
    }
}

class Task {
    private final long number;
    private final int priority;

    public Task(long number, int priority) {
        this.number = number;
        this.priority = priority;
    }

    public long getNumber() {
        return number;
    }

    public int getPriority() {
        return priority;
    }
}

public class TasksHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("numberOfQueues");
        int numberOfQueues = Integer.parseInt(scanner.nextLine());
        System.out.println("numberOfTasks");
        int numberOfTasks = Integer.parseInt(scanner.nextLine());

        TaskManager manager = new TaskManager(numberOfQueues);
        System.out.println("Size " + manager.getTaskQueues().size());

        for (int i = 0; i < numberOfTasks; i++) {
            String[] taskParts = scanner.nextLine().split("\\s+");
            long number = Long.parseLong(taskParts[0]);
            int priority = Integer.parseInt(taskParts[1]);
            Task task = new Task(number, priority);
            manager.add(task, priority);
        }

//        for (Queue<Task> taskQueue : manager.getTaskQueues()) {
//            System.out.println(taskQueue.peek().getNumber());
//
//        }


//        System.out.println(manager.getTaskQueues().toString());

        Supplier<Task> taskSupplier = manager.getTaskSupplier();
        Task task;
        while ((task = taskSupplier.get()) != null) {
            System.out.println(task.getNumber());
        }
    }
}
