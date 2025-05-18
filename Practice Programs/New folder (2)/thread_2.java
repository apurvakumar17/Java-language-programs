import java.util.Scanner;

class TimeLoom2 extends Thread {
    TimeLoom2(String name) {
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
class GetName implements Runnable{
    int Age;
    @Override
    public void run(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.err.print("Enter Age: ");
            Age = sc.nextInt();
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        sc.close();
    }
}
public class thread_2 {
    public static void main(String[] args) {
        System.out.println("Main Thread Started..");
        TimeLoom2 thread1 = new TimeLoom2("Thread 1");
        TimeLoom2 thread2 = new TimeLoom2("Thread 2");
        TimeLoom2 thread3 = new TimeLoom2("Thread 3");
        GetName g1 = new GetName();
        Thread gn1 = new Thread(g1);
        thread1.start();
        thread2.start();
        thread3.start();
        gn1.start();
        System.out.println("Main Thread Finished!");
    }
}
