class MyThread extends Thread {
    double e;
    public void run() {
        for (int i = 0; i < 15; i++) {
            e += 1.0 / factorial(i);
        }
    }
    int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }
}

public class join_thread {
    public static void main(String[] args) {
        System.out.println("Main Thread Starts..");
        MyThread t1 = new MyThread();
        t1.setName("Factorial Calculation Thread..");
        t1.start();
        System.out.println(t1.getName() + "is alive = " + t1.isAlive());
        try {
            t1.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Value of e = " + t1.e);
        System.out.println(t1.getName() + "is alive = " + t1.isAlive());
        System.out.println("Main Thread ends..");
    }    
}
