import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
        sc.close();
    }
    
    public void output() {
        System.out.println("\nRectangle Dimensions:");
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + calcArea());
    }
    
    public double calcArea() {
        return length * breadth;
    }
}

public class P4 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.input();
        rect.output();
        System.out.println("\nPractical 4, 04814902024, Apurva Kumar\n");
    }
}
