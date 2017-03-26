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
public class Husband extends Thread {
    
    
    private final BlockingQueue queue;
    private final BlockingQueue queue1;

    public Husband(BlockingQueue queue, BlockingQueue queue1) {
        this.queue = queue;
        this.queue1 = queue1;
    }

    public void notifyWife() throws InterruptedException {
        while (true) {
            Thread.sleep(1000);
            queue.take();
            queue1.put(1);
            System.out.println("Husband: Wake up wife, show has just started.");
        }
    }

    @Override
    public void run() {
        VacuumCleaner vc = new VacuumCleaner();
        vc.start();
        System.out.println("Husband: I am running it.");
        while (true) {
            try {
                Thread.sleep(1000);
                notifyWife();
            } catch (InterruptedException ex) {
                Logger.getLogger(Husband.class.getName()).log(Level.SEVERE, null, ex);
            }
        
     }

     }

   }