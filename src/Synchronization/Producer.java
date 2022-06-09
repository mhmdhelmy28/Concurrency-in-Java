package Synchronization;


import java.util.Random;

public class Producer implements Runnable{

    @Override
    public void run() {
        Random randomNumber = new Random();
        try {
            while (true) {
                synchronized (Main.bucket) {
                    if (Main.bucket.size() < 100) {
                        int num = randomNumber.nextInt(1000);
                        Main.bucket.add(num);
                        Main.bucket.notifyAll();
                        System.out.println("added value " + num + " by " + Thread.currentThread().getName());
                    } else {
                        Main.bucket.wait();
                    }
                }
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}