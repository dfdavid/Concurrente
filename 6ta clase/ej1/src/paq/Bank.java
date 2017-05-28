package paq;

/**
 * Created by iv on 18/04/17.
 */
public class Bank implements Runnable {

    private Account account;

    public Bank(Account account) {
        this.account = account;
    }

    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            this.account.substractAmount(1000);
        }

    }

}