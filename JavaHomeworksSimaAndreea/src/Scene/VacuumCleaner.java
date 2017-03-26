/*
 * 



 */
package Scene;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Deea
 */
public class VacuumCleaner extends Thread  {

    public void startCleaning() {
        System.out.println("VACUUM CLEANER is running.");
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(VacuumCleaner.class.getName()).log(Level.SEVERE, null, ex);
        }
        startCleaning();
    }
}
    

