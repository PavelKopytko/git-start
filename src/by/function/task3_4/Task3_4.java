package by.function.task3_4;

import java.util.function.*;

public class Task3_4 {
    public static void main(String[] args) {

        IntBinaryOperator inter1 = (a, b) -> a > b ? a : b;
        System.out.println(inter1.applyAsInt(5, 6));

        ToIntFunction<String> inter2 = string -> string.length();
        System.out.println(inter2.applyAsInt("abc"));

        UnaryOperator<String> inter3 = string -> string.toLowerCase();
        System.out.println(inter3.apply("de"));

        IntFunction<String> inter4 = n -> "abc" + n;
        System.out.println(inter4.apply(5));

        BiFunction<String, Integer, Character> inter5 = (string, n) -> string.charAt(n);
        try {
            System.out.println(inter5.apply("asd", 2));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("неверный номер");
        }
    }
}
