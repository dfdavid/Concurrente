package ej1_c6;

public class Account {
	private double balance;

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public synchronized void addAmount(double amount) {   //este metodo lo utiliza solo Company
	//public  void addAmount(double amount) {	
		double tmp=balance;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tmp+=amount;
		balance=tmp;
	}

	public synchronized void subtractAmount(double amount) {   //este metodo lo utiliza solo Bank
	//public  void subtractAmount(double amount) {
		double tmp=balance;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tmp-=amount;
		balance=tmp;
	}

}
