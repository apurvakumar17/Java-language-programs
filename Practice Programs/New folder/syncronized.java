class Bank {
    int balance = 5000;
    void showBalance() {
        System.out.println(balance);
    }
    synchronized void withdrawBalance(int withdraw) {
        int newbalance = balance - withdraw;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
        balance = newbalance;
    } 
}
class Person extends Thread{
    Bank bank;
    Person( Bank b) {
        bank = b;
    }
    @Override
    public void run() {
        bank.withdrawBalance(500);
    }

}
public class syncronized {
    public static void main(String[] args) {
        Bank b = new Bank();
        Person p1 = new Person(b);
        Person p2 = new Person(b);
        p1.setName("Apurva");
        p2.setName("SHreyas");
        p1.start();
        p2.start();
        try {
            p1.join();
            p2.join();
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
        b.showBalance();        
    }
}