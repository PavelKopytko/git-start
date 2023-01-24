package by.collection;

public class Apple {
    private static long counter;
    private long id = counter++;

    public long id() {
        return id;
    }

    @Override
    public String toString() {
        return "I'm apple";
    }
}
