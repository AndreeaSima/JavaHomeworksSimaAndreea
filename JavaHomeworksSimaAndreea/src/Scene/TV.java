/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scene;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Deea
 */
public class TV extends Thread {

private BlockingQueue queue;

    public TV(BlockingQueue queue) {
        this.queue = queue;
    }

    public void startShow() throws InterruptedException {
        while (true) {
            Thread.sleep(2000);
            queue.put(1);
            System.out.println("TV: Show has started.");
        }
    }

    @Override
    public void run() {
        System.out.println("TV: I am running.");
        try {
            Thread.sleep(1000);
            startShow();
        } catch (InterruptedException ex) {
            Logger.getLogger(TV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 }
    
    

