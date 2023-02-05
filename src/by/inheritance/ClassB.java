package by.inheritance;

public class ClassB extends ClassA {
    int a = 1;
    int b = 2;

    @Override
    public void m1() {
        System.out.println("m1 from B");
    }
}
