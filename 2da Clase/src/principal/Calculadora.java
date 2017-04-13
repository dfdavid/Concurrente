package principal;

public class Calculadora implements Runnable {
	private int number;
	
	public Calculadora(int number) {
		super();
		this.number = number;
	}

	@Override
	public void run() {
		for(int i= 1; i<=10; i++){
			System.out.printf("%s: %d * %d = %d\n", Thread.currentThread().getName(), number,i,i*number);
			
		}
		
	}	

}
