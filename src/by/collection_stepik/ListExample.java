package by.collection_stepik;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {

        List<String> listA = new ArrayList<>();

        listA.add("element 01");
        listA.add("element 1");
        listA.add("element 222");
        int size = listA.size();

        System.out.println(listA);
        Collections.sort(listA, (String s1, String s2) -> (Integer.valueOf(s2.length())).compareTo(s1.length()));
        System.out.println(listA);

        

        System.out.println("size = " + size);

//access via index
        String element0 = listA.get(0);
        String element1 = listA.get(1);
        String element3 = listA.get(2);

//print all elements
        System.out.println("print all elements with iterator");
        Iterator iterator = listA.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//foreach-loop
        System.out.println("print all elements with foreach-loop");
        for (Object object : listA) {
            String element = (String) object;
            System.out.println(element);
        }

//classic for loop
        System.out.println("print all elements with classic loop");
        for (int i = 0; i < listA.size(); i++) {
            System.out.println(listA.get(i));
        }

        ArrayList<Integer> listB = new ArrayList<>();
        listB.addAll(Arrays.asList(100, 200, 300));
//sorting
        Collections.sort(listB, (o1, o2) -> o2.compareTo(o1));//descending order
        System.out.println("descending order" + listB + "\n");
        Collections.sort(listB);//ascending order
        System.out.println("ascending order" + listB + "\n");

//filtering
//        remove all numbers more than 200
        listB.removeIf(i -> i > 200);
        listB.stream().filter(i -> i <= 200);
    }
}
