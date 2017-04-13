package principal;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		Thread threads[] = new Thread[10];
		Thread.State status[] =new Thread.State[10];
		
		for (int i=0; i<10; i++){
			threads[i] = new Thread(new Calculadora(i));
			
			// (i % 2) es el resto de la division por 2
			if ((i % 2)==0){
				threads[i].setPriority(Thread.MAX_PRIORITY);}
			else {
				threads[i].setPriority(Thread.MIN_PRIORITY);
			}
		}
	}
	
}
