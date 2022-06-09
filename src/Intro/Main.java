package Intro;

public class Main{
             //start()
    // New   ---->  Runnable ----> Running  -----> Blocked  ------> Runnable
    //         ( some time here  )
    // if you used run it got merged with the current thread
    public static void main(String[] args) {
        Runnable r1 = new DB1Runnable();
        Runnable r2 = new DB2Runnable();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
        // Thread may be in an interrupted state
         try {
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Processing");

    }
}
