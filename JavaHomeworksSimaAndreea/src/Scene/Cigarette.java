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
public class Cigarette extends Thread {
    
   public void burning() {
        System.out.println("CIGARETTE is burning.");
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cigarette.class.getName()).log(Level.SEVERE, null, ex);
        }
        burning();
    }
}

    

