package by.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class GenericAndUpcasting {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple());
        apples.add(new Gala());
        apples.add(new GrannySmith());
//        apples.add(new Orange());

        for (Apple a : apples) {
            System.out.println(a);

        }

    }
}
