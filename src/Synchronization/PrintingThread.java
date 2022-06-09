package Synchronization;

public class PrintingThread implements Runnable{
    @Override
    public void run(){
        try {
            while (true) {
                System.out.println(Main.counter);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
                e.printStackTrace();
            }

    }
}
