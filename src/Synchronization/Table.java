package Synchronization;

public class Table {

    // if we used static method it will do the same as if we have introduced one instance of the class and a lock manages the instance as the maintainer
    public synchronized void print(int size){
        try {
            for (int i = 0; i < size; i++) {
                System.out.println(i * size);
                Thread.sleep(500);
            }
        } catch (InterruptedException e ){
            e.printStackTrace();
        }
    }
}
