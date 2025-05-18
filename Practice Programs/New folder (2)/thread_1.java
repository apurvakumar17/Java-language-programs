class TimeLoom extends Thread {
    TimeLoom(String name) {
        setName(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " " + i);
            try {
                sleep(500);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}

public class thread_1 {
    public static void main(String[] args) {
        System.out.println("Main Thread Started..");
        TimeLoom thread1 = new TimeLoom("Thread 1");
        TimeLoom thread2 = new TimeLoom("Thread 2");
        TimeLoom thread3 = new TimeLoom("Thread 3");
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("Main Thread Finished!");
    }
}
