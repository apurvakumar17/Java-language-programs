class Account extends Thread{
    private int balance = 5000;
    int getBalance() {
        return balance;
    }
    synchronized void depositAmt(int amt) {
        int newbalance = balance + amt;
        try {
            sleep(500);
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }
        balance = newbalance;
    }
}

class AddTask extends Thread {
    Account Obj;
    AddTask(Account ob) {
        Obj = ob;
    }
    @Override
    public void run() {
        Obj.depositAmt(100);
    }
}
public class bank {
    public static void main(String[] args) {
        System.out.println("Main Thread Started..");
        Account bob = new Account();
        AddTask t1 = new AddTask(bob);
        AddTask t2 = new AddTask(bob);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Final Amount: " + bob.getBalance());
        System.out.println("Main Thread Ended..");
    }
}
