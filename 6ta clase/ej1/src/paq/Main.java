package paq;

/**
 * Created by iv on 18/04/17.
 */
public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(1000);

        Company company = new Company(account);
        Thread companyThread = new Thread(company);

        Bank bank = new Bank(account);
        Thread bankThread = new Thread(bank);

        System.out.printf("Account : Initial Balance: %f", account.getBalance());

        // start the threads
        companyThread.start();
        bankThread.start();

        // wait for both of the threads to finish
        try {
            companyThread.join();
            bankThread.join();

            System.out.printf("Account : Final Balance: %f", account.getBalance());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}