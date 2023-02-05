package by.inheritance;

public class Main {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        System.out.println("a =" + a.a);
        System.out.println("b =" + a.b);
        a.m1();

        System.out.println();

        ClassB b = new ClassB();
        System.out.println("a =" + b.a);
        System.out.println("b =" + b.b);
        b.m1();

        System.out.println();

        ClassA ab = new ClassB();
        System.out.println("a =" + ab.a);
        System.out.println("b =" + ab.b);
        b.m1();
    }
}
