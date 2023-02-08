package by.function;

public class Main {
    public static void main(String[] args) {
        Function1 squareFunction = new Function1() {
            @Override
            public Integer apply(Integer number) {
                return number * number;
            }
        };

        System.out.println(squareFunction.apply(10));
        System.out.println(squareFunction.apply(20));

    }

}
