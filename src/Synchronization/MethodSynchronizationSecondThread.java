package Synchronization;

public class MethodSynchronizationSecondThread implements Runnable{

    Table t;
    public MethodSynchronizationSecondThread(Table t){
        this.t = t;
    }
    @Override
    public void run(){
        t.print(5);
    }
}
