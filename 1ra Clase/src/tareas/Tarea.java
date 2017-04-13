package tareas;

public class Tarea {
	
	public Tarea(){
		Calculator tarea1= new Calculator(5);
		Thread h1= new Thread(tarea1);
		h1.start();
		h1.run();
	}
}
