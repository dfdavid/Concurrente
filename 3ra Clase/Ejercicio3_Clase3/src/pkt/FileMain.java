package pkt;

import java.util.concurrent.TimeUnit;

public class FileMain {
	
	public static void main(String[] args) {
	
		FileClock clock = new FileClock();
		Thread thread = new Thread(clock);
		thread.start();
		
		try {
			TimeUnit.SECONDS.sleep(5); //esto se refiere al unico hilo que hay?
		} 
		
		
		catch (InterruptedException e) {
			e.printStackTrace(); // que hace esto?
		}

		thread.interrupt();
	}

}