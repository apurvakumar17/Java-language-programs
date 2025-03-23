import java.util.Scanner;

class AreaCalculator {
    // Method to calculate area of square
    public static double calculateArea(double side) {
        return side * side;
    }
    
    // Method to calculate area of rectangle
    public static double calculateArea(double length, double breadth) {
        return length * breadth;
    }
    
    // Method to calculate area of triangle
    public static double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        System.out.println("Area of square: " + AreaCalculator.calculateArea(side));
        
        System.out.print("Enter length and breadth of rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        System.out.println("Area of rectangle: " + AreaCalculator.calculateArea(length, breadth));
        
        System.out.print("Enter base and height of triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Area of triangle: " + AreaCalculator.calculateArea(base, height, true));
        sc.close();
        System.out.println("\nPractical 7, 04814902024, Apurva Kumar\n");
    }
}
