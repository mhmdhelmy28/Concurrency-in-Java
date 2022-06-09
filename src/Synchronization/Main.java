package Synchronization;

import Intro.DB1Runnable;

import java.util.*;

public class Main {







    public static List<Integer> bucket = new ArrayList<>();
    public static volatile int counter = 0;
    public static void main(String[] args) {
//        Runnable producer = new Producer();
//        Runnable consumer = new Consumer();
//        Thread p1 = new Thread(producer, "p1");
//        Thread p2 = new Thread(producer, "p2");
//        Thread c1 = new Thread(consumer, "c1");
//        Thread c2 = new Thread(consumer, "c2");
//
//        p1.start();
//        p2.start();
//        c1.start();
//        c2.start()
//

         // Data Consistency
//        Runnable d1 = new IncrementingThread();
//        Runnable d2 = new PrintingThread();
//        Thread t1 = new Thread(d1);
//        Thread t2 = new Thread(d2);
//        t1.start();
//        t2.run();


        // Method Synchronization
        // if we used one instance then there is a lock till it gets to a blocked state
        // if we used 2 then we are concurrently good :)
//        Table t = new Table();
//        Runnable r1 = new MethodSynchronizationFirstThread(t);
//        Runnable r2 = new MethodSynchronizationSecondThread(t);
//
//        Thread t1 = new Thread(r1);
//        Thread t2 = new Thread(r2);
//
//        t1.start();
//        t2.start();





    }
}
