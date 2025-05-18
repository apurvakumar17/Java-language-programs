class A {
    {
        System.out.println("I will get executed each time! ");
    }
    static {
        System.out.println("I will get executed only once! ");
    }
}
public class inst_n_static {
    public static void main(String[] args) {
        new A();
        new A();
        new A();
    }
}