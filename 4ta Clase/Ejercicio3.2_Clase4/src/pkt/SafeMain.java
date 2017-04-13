package pkt;
import java.util.concurrent.TimeUnit;

public class SafeMain {
	public static void main(String[] args){
		//ctreates a task
		SafeTask task=new SafeTask();
		
		//se crea e inicia un objeto :Thread con la tarea como argumento
		for (int i=0; i<10;i++){
			Thread thread=new Thread(task);
			try{
				TimeUnit.SECONDS.sleep(2);
							}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			thread.start();
		}
	}

}
