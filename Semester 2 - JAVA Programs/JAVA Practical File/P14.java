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

    // Overriding the display method
    @Override
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
    }
}

public class P14 {
    public static void main(String[] args) {
        Person person = new Student("Alice", 101); // upcasting
        person.display(); // run-time polymorphism: calls Student's display()
        System.out.println("\nPractical 14, 04814902024, Apurva Kumar\n");
    }
}