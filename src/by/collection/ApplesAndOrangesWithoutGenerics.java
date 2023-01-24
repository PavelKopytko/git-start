package by.collection;

import java.util.ArrayList;

public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("uncheked")
    public static void main(String[] args) {

        ArrayList apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        apples.add(new Orange());

        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i));
        }
    }
}
