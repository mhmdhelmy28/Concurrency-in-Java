package Synchronization;
// as each thread has its own address space, there might be some inconsistency when increment thread updates the counter value as the printing thread might print the old value, so we use volatile
public class IncrementingThread implements Runnable{
    @Override
    public void run() {
        try {
            while (true) {
                Main.counter++;
                Thread.sleep(505);
            }
        }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

