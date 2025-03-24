class Box {
    double length;
    double breadth;
    double height;
    Box() {
        System.out.println("Default constructor called!");
    }
    Box(double length, double breadth, double height) {
        this.length = length;
        this.height = height;
        this.breadth = breadth;
    }
    void sp() {
        System.out.println("I am special from parent");
    }
}

class poorBoxWeight extends Box{
    double weight;
    poorBoxWeight(double l, double b, double h, double w) {
        //Automatically calling default constructor of parent class
        length = l;
        breadth = b;
        height = h;
        weight = w;
    }
    void display() {
        System.out.println("\nLength: " + length + "\nBreadth: " + breadth + "\nHeight: " + height + "\nWeight: " + weight);
    }
}

class superBoxWeight extends Box{
    double weight;
    superBoxWeight(double l, double b, double h, double w) {
        super(l, b, h); // calling constructor of parent using super
        weight = w;
    }
    void display() {
        System.out.println("\nLength: " + length + "\nBreadth: " + breadth + "\nHeight: " + height + "\nWeight: " + weight);
        super.sp();
    }
}

public class inheritance1 {
    public static void main(String[] args) {
        poorBoxWeight poorbox = new poorBoxWeight(12, 56, 89, 10);
        poorbox.display();

        superBoxWeight superbox = new superBoxWeight(12, 56, 89, 10);
        superbox.display();
    }


}
