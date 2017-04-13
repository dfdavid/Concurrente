package pkt;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by iv on 04/04/17.
 */
public class NetworkConnectionsLoader implements Runnable {
    @Override
    public void run(){
        System.out.printf("Beginning Network connections loading: %s\n", new Date());
        try{
            TimeUnit.SECONDS.sleep(9);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.printf("Network connections loading finished: %s\n", new Date());

    }
}
