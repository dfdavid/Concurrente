package pkt;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FileClock implements Runnable{ //  Cualquier clase que implemente la interfaz Runnable tiene que 
											//  implementar obligatoriamente el metodo run().
											//  La interfaz Runnable debe ser implementada por cualquier 
											//  clase cuyas instancias estén destinadas a ser ejecutadas
											//  por un subproceso (hilo). La clase debe definir un método 
											//  sin argumentos llamado run.
	public void run(){
		for(int i=0; i<10;i++){ //Este ciclo "for" va desde 0 hasta 9 en saltos de 1
			
			System.out.printf("%s\n", new Date());
			
			try{
				TimeUnit.SECONDS.sleep(1);
			}
			
			catch (InterruptedException e){
				System.out.printf("El hilo que ejecuta el objeto clock ha sido interrumpido");
				return;
			}
		}
	}
		
}