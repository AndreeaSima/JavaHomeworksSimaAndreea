/*
 * 
 */
package Scene;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author Deea
 */
public class Multithreading {
    
    
    static BlockingQueue queue = new ArrayBlockingQueue<>(1);
    static BlockingQueue queue1 = new ArrayBlockingQueue<>(1);

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread((Runnable) new TV(queue));
        Thread t2 = new Thread((Runnable) new Wife(queue1));
        Thread t3 = new Thread(new Husband(queue, queue1));
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
    }
    
  }

    

