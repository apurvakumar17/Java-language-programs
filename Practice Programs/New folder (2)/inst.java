class Animal {
    void Sound() {
        System.out.println("I make a sound");
    }
}

class Dog extends Animal {
    void Sound() {
        System.out.println("I Bark");
    }
}

class Cat extends Animal {
    void Sound() {
        System.out.println("I Meow");
    }
}

public class inst {
    public static void main(String[] args) {
        Animal a = new Cat();
        if (a instanceof Dog) {
            a.Sound();
            Dog d = (Dog) a;
            d.Sound();
        } else if(a instanceof Cat) {
            a.Sound();
            Cat c = (Cat) a;
            c.Sound();
        }
    }
}

