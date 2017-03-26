/*
 * 
 */
package Scene;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Deea
 */
public class Wife extends Thread {
private BlockingQueue queue;

    public Wife(BlockingQueue queue) {
        this.queue = queue;
    }

    public void wakeSleepWife() throws InterruptedException {
        while (true) {
            Thread.sleep(2000);
            queue.take();
            System.out.println("Wife: Thank you dear husband for waking me for my favourite show.");
        }
    }

    @Override
    public void run() {
        Thread c = new Cigarette();
        c.start();
        System.out.println("Wife: I am running.");
        while (true) {
            try {
                Thread.sleep(1000);
                wakeSleepWife();
            } catch (InterruptedException ex) {
                Logger.getLogger(Husband.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
    
    

    
    

