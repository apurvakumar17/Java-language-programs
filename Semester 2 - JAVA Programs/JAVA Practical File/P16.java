interface InterfaceA {
    int VALUE = 10; // same data member
    void methodA(); // unique method
}

interface InterfaceB {
    int VALUE = 20; // same data member (will be hidden)
    void methodB(); // unique method
}

class MyClass implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Method A from InterfaceA");
    }

    @Override
    public void methodB() {
        System.out.println("Method B from InterfaceB");
    }

    public void showValues() {
        System.out.println("VALUE from InterfaceA: " + InterfaceA.VALUE);
        System.out.println("VALUE from InterfaceB: " + InterfaceB.VALUE);
    }
}

public class P16 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
        obj.showValues();
        System.out.println("\nPractical 16, 04814902024, Apurva Kumar\n");
    }
}