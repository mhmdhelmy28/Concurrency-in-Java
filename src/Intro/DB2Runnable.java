package Intro;

public class DB2Runnable implements Runnable{
    public void run(){
        try {
            System.out.println("Querying DB2");
            Thread.sleep(3000);
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
