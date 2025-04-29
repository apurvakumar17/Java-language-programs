class Bankac {
    private double balance = 5000;
    public double getBalance() {
        return balance;
    }
    public synchronized void deposit() {
        System.out.println(Thread.currentThread().getName() + " reads balance ---> " + balance);
        double newBalance = balance + 100;
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e){}
        balance = newBalance;
    }
}

class depositTask extends Thread{
    Bankac acc2;
    depositTask(Bankac acc) {
        acc2 = acc;
    }
    public void run() {
        acc2.deposit();
    }
}
public class method_thread_sync {
    public static void main(String[] args) {
        Bankac account1 = new Bankac();
        depositTask d1 = new depositTask(account1);
        depositTask d2 = new depositTask(account1);
        d1.start();
        d2.start();
        try {
            d1.join();
            d2.join();
        } catch(InterruptedException e) {}
        System.out.println("Bank balance " + account1.getBalance());
    }
}
