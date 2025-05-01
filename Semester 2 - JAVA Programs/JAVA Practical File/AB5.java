// First class implementing Runnable to print your name
class NamePrinter implements Runnable {
    public void run() {
        System.out.println("Apurva Kumar");
    }
}

// Second class implementing Runnable to print "Hello Java"
class MessagePrinter implements Runnable {
    public void run() {
        System.out.println("Hello Java");
    }
}

// Main class to start both threads
public class AB5 {
    public static void main(String[] args) {
        // Create instances of the Runnable classes
        Runnable nameTask = new NamePrinter();
        Runnable messageTask = new MessagePrinter();

        // Create threads
        Thread thread1 = new Thread(nameTask);
        Thread thread2 = new Thread(messageTask);

        // Start threads
        thread1.start();
        thread2.start();
        System.out.println("\nApp. Based Practical 5, 04814902024, Apurva Kumar\n");
    }
}