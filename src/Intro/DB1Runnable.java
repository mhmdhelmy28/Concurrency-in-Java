package Intro;

public class DB1Runnable  implements Runnable{
    public void run(){

        try {
            System.out.println("Querying DB1");
            Thread.sleep(3000);
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
