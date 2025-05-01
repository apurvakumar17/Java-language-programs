// Child thread class extending Thread
class MyThread extends Thread {
    private String threadName;

    public MyThread(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(500); // Sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " has finished.");
    }
}

// Main class
public class P21 {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        // Creating multiple child threads
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        MyThread t3 = new MyThread("Thread-3");

        // Starting threads
        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main thread ended.");
        System.out.println("\nPractical 21, 04814902024, Apurva Kumar\n");
    }
}
