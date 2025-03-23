class ThisDemo {
    private int num;
    
    public ThisDemo(int num) {
        this.num = num; // Using 'this' to refer to the instance variable
    }
    
    public void display() {
        System.out.println("Value of num: " + this.num); // Using 'this' explicitly
    }
    
    public void show() {
        this.display(); // Using 'this' to call another method
    }
}

public class P11 {
    public static void main(String[] args) {
        ThisDemo obj = new ThisDemo(10);
        obj.show();
        System.out.println("\nPractical 11, 04814902024, Apurva Kumar\n");
    }
}
