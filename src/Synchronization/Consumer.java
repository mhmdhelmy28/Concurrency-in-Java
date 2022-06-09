package Synchronization;


public class Consumer implements Runnable{

    @Override
    public void run(){
        try {
        while (true) {
            // not sync
            synchronized (Main.bucket) {
                if (!Main.bucket.isEmpty()) {
                    int num = Main.bucket.get(0);
                    Main.bucket.remove(0);
                    Main.bucket.notifyAll();
                    System.out.println("Removed value " + num + " by " + Thread.currentThread().getName());
                } else {
                    Main.bucket.wait();
                }
            }
        }// not sync
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}