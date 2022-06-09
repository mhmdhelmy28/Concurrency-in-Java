package Barriers;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Task implements Runnable{

    // no access to the code till a number of thread reaches
    CyclicBarrier barrier = new CyclicBarrier(2);
    @Override
    public void run(){
        try {
        barrier.await();
            System.out.println(":(");
    } catch (InterruptedException | BrokenBarrierException e){
        e.printStackTrace();
        }
    }
}
