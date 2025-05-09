interface Mammal {
    void speaks();
}

interface Animal {
    void sleeps();
}

class Living {
    void isAlive() {
        System.out.println("Heart beats");
    }
}

class Human  extends Living implements Mammal,Animal{
    @Override
    public void speaks() {
        System.out.println("Bolta hai");
    }

    @Override
    public void sleeps() {
        System.out.println("Sota hai!");
    }
}

public class interfacing {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.sleeps();
        h1.speaks();
        h1.isAlive();
    }
}
