class Box {
    double length;
    double breadth;
    double height;
    double volume() {
        return (length * breadth * height);
    }
    Box() {
        length = -1;
        breadth = -1;
        height = -1;
    }
    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }
    Box(double s){
        length = breadth = height = s;
    }
}



public class objects_of_class_2 {
    public static void main(String args[]) {
        Box myBox1 = new Box();
        Box myBox2 = new Box(5);
        Box myBox3 = new Box(1, 2, 3);
        System.out.println("Volume for no values given: " + myBox1.volume());
        System.out.println("Volumne for one side given: "+ myBox2.volume());
        System.out.println("Volume for l, b & h given: " + myBox3.volume());
    }
}
