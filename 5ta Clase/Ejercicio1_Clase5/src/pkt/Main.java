package pkt;

/**
 * Created by iv on 11/04/17.
 */
public class Main {

    public static void main(String[] args){
        Task task = new Task();
        Thread thread = new Thread(task);

        thread.setUncaughtExceptionHandler(new ExceptionHandler());

        thread.start();

        try{
            thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.printf("Thread has finished");
    }
}
