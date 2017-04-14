
//este comentario solo esta en el branch "net"


public class Main {
	public static void main(String[] args){
		//se crea la Factory
		MyThreadFactory factory= new MyThreadFactory("MyThreadFactory");
		//crea una tarea
		Task task=new Task();
		Thread thread;
		
		//Crea y le da start a 10 objetos Thread
		System.out.printf("Starting the Threads\n");
		for (int i=0; i<10; i++){
			thread=factory.newThread(task);
			thread.start();
		}
		
		//Se imprimen las estadisticas de la ThreadFactory en la consola
		System.out.printf("Factory stats: \n");
		System.out.printf("%s\n", factory.getStats());
	}

}
