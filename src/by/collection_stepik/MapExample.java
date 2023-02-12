package by.collection_stepik;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, String> mapA = new HashMap<>();
        mapA.put("First", "first add");
        mapA.put("Second", "second add");
        mapA.put("Third", "third add");

        System.out.println(mapA);

        // key iterator
        System.out.println("\nKey iterator + value iterator");
        Iterator<String> iterator = mapA.keySet().iterator();
        // value iterator
        Iterator<String> iterator1 = mapA.values().iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Object value = mapA.get(key);
            System.out.println(key + "+" + value);
        }

        System.out.println("\nfunctional way to iterate and print");
        iterator1.forEachRemaining(System.out::println);


        //access via new for-loop
        for (Object key : mapA.keySet()) {
            Object value = mapA.get(key);
        }

        // using Entry
        for (Map.Entry<String, String> entry : mapA.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        //in java8
        mapA.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
