class Animal {
    int hp = -1;
    void sound() {
        System.out.println("Awaj nikata hai!");
    }
}
class Dog extends Animal {
    int hp = 5;
    void sound() {
        System.out.println("Bhokta hai!");
    }
}
class Human extends Animal{
    int hp = 10;
    void sound() {
        System.out.println("Bolta hai!");
    }
}

public class runtimepoly {
    public static void main(String[] args) {
        Animal an = new Human();
        an.sound();
        System.out.println(an.hp);
        an = new Dog();
        an.sound();
        System.out.println(an.hp);
    }
}
