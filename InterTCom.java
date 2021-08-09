class Customer{
    int amount = 10000;

    synchronized void withdraw(int amt) {
        System.out.println("going to withdraw...");
        if (this.amount < amt) {
            System.out.println("Less balance; waiting for deposit...");
            try{
                wait();
            } catch (Exception e) {
            }
        }
        this.amount -= amt;
        System.out.println("withdraw completed...");
    }

    synchronized void deposit(int amt) {
        System.out.println("going to deposit...");
        this.amount += amt;
        System.out.println("deposit completed... ");
        notify();
    }

    void display()
    {
        System.out.println("Displayed called");
    }
}

public class InterTCom {
    public static void main(String args[]) {
        final Customer c = new Customer();
        new Thread() {
            public void run() {
                c.withdraw(15000);
            }
        }.start();
        new Thread() {
            public void run() {
                c.deposit(10000);
            }
        }.start();
    }
}