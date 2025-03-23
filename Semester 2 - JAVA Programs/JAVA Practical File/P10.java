class StaticDemo {
    static int count;
    
    static {
        System.out.println("Static block executed");
        count = 0;
    }
    
    public StaticDemo() {
        count++;
    }
    
    public static void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class P10 {
    public static void main(String[] args) {
        System.out.println("Main method started");
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        StaticDemo.displayCount();
        System.out.println("\nPractical 10, 04814902024, Apurva Kumar\n");
    }
}
