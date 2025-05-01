class Person {
    String name;

    // Base class constructor
    public Person(String name) {
        this.name = name;
        System.out.println("Person constructor called");
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int id;

    // Derived class constructor using super() to call base class constructor
    public Student(String name, int id) {
        super(name); // invokes base class constructor
        this.id = id;
        System.out.println("Student constructor called");
    }

    public void show() {
        display();
        System.out.println("ID: " + id);
    }
}

public class P13 {
    public static void main(String[] args) {
        Student student = new Student("Alice", 101);
        student.show();
        System.out.println("\nPractical 13, 04814902024, Apurva Kumar\n");
    }
}
