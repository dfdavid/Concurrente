package paq;

/**
 * Created by iv on 18/04/17.
 */
public class Account {


    private double balance;

    public synchronized void addAmount(double amount) {
        double tmp = this.balance;

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tmp += amount;
        //synchronized (this) {
            this.balance = tmp;
        //}
    }

    public synchronized void substractAmount(double amount) {
        double tmp = this.balance;

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tmp -= amount;
        //synchronized (this) {
            this.balance = tmp;
        //}
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance
     *            the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

}