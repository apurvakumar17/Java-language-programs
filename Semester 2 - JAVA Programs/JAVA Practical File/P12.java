// Multi-level Inheritance
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal {
    public void walk() {
        System.out.println("This mammal walks.");
    }
}

class Dog extends Mammal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    public void meow() {
        System.out.println("The cat meows.");
    }
}

class Tiger extends Animal {
    public void growl() {
        System.out.println("The Tiger growls.");
    }
}

public class P12 {
    public static void main(String[] args) {
        // Demonstrating Multi-level Inheritance
        Dog dog = new Dog();
        dog.eat();
        dog.walk();
        dog.bark();

        System.out.println();

        // Demonstrating Hierarchical Inheritance
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.growl();
        System.out.println("\nPractical 12, 04814902024, Apurva Kumar\n");
    }
}
