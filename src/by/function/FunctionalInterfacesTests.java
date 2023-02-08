package by.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalInterfacesTests {
    public static void main(String[] args) {

        Function<Integer, Integer> plusOne = x -> x + 1;
        System.out.println(plusOne.apply(1));

        BiFunction<Long, Long, Long> sum = (a, b) -> a + b;
        System.out.println(sum.apply(1l, 2l));

        BiFunction<Integer, Integer, Integer> function = (a, b) -> {
            return (a < b) ? a : b;
        };
        System.out.println(function.apply(1, 2));
    }
}
