package by.function.task3_3;

import java.util.function.Function;

public class Reference {
    public static void main(String[] args) {

        String address = "11522 Shawnee Road, Greenwood DE 19950";

//        Function<String, Integer> indexing = address::indexOf;
        Function<String, Boolean> indexing = s -> address.contains(s);

        System.out.println(indexing.apply("115"));   // 0
        System.out.println(indexing.apply("Green")); // 20
        System.out.println(indexing.apply("Blue"));
    }
}
