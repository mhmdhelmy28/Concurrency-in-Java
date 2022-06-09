package Synchronization;

public class MethodSynchronizationFirstThread implements Runnable{

    Table t;
    public MethodSynchronizationFirstThread(Table t){
        this.t = t;
    }
    @Override
    public void run(){
        t.print(5);
    }
}
