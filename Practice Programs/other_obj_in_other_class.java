class Dog {
    String dname;
    String breed;
    Integer dage;
    Dog (String dname, String breed, Integer dage) {
        this.dname = dname;
        this.breed = breed;
        this.dage = dage;
    }
    Dog () {
        dname = "_blank_";
        breed = "_unknown_";
        dage = 0;
    }
    String dintro() {
        return ("I have a dog named " + dname + " of breed " + breed + " aged " + dage + " years old.");
    }
}


class Person {
    String name;
    int age;
    int id;
    Dog myDog;
    Person (String name, int age, int id, String dname, String breed, Integer dage) {
        this.name = name;
        this.age = age;
        this.id = id;
        myDog = new Dog(dname, breed, dage);
    }
    Person (String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
        myDog = new Dog();
    }
    Person () {
        name = "_blank_";
        age = 0;
        id = 0;
        myDog = new Dog();

    }
    String intro () {
        return ("My name is " + name + ". I am " + age + " years old." + " With ID = " + id + "\n" + myDog.dintro());
    }
}

public class other_obj_in_other_class {
    public static void main(String[] args) {
        Person ap1,ap2, ap3;
        ap1 = new Person();
        System.out.println(ap1.intro());
        System.out.println();
        ap2 = new Person("Apurva", 18, 48);
        System.out.println(ap2.intro());
        System.out.println();
        ap3 = new Person("Apurva", 18, 48, "Rocky", "Bulldog", 5);
        System.out.println(ap3.intro());
        System.out.println();
    }
}