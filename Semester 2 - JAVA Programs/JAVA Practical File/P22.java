class TableThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + ": 5 x " + i + " = " + (5 * i));
            try {
                Thread.sleep(200); // Slight delay for clearer output
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
    }
}

class MessageThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + ": Hello from Thread");
            try {
                Thread.sleep(200); // Slight delay for clearer output
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
    }
}

public class P22 {
    public static void main(String[] args) {
        TableThread tableThread = new TableThread();
        MessageThread messageThread = new MessageThread();

        // Set names
        tableThread.setName("TableThread");
        messageThread.setName("MessageThread");

        // Set priorities
        tableThread.setPriority(Thread.MAX_PRIORITY); // Priority 10
        messageThread.setPriority(Thread.MIN_PRIORITY); // Priority 1

        // Start threads
        tableThread.start();
        messageThread.start();

        // Display names and priorities
        System.out.println("Thread Name: " + tableThread.getName() + ", Priority: " + tableThread.getPriority());
        System.out.println("Thread Name: " + messageThread.getName() + ", Priority: " + messageThread.getPriority());
        System.out.println("\nPractical 22, 04814902024, Apurva Kumar\n");
    }
}
