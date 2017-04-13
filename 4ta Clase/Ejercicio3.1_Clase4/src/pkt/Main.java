package pkt;
import java.util.concurrent.TimeUnit;;


public class Main {
	public static void main(String[] args){
		//creates unsafeTask
		UnsafeTask task=new UnsafeTask();
		
		//Lanzar tres objetos Thread
		for(int i=0; i<10; i++){
			Thread thread=new Thread(task);
			thread.start();
			try{
				TimeUnit.SECONDS.sleep(2);
				}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
