package Locks;
import java.util.concurrent.Semaphore;
// when you need to customize your own lock. as it allows the critical section to be accessed by multiple threads
public class Sempahore {

    Semaphore semaphore = new Semaphore(4);

    public static void main(String[] args) {
        // Semaphore  -> synchronizations
    }

    public void m() {
        try {
            semaphore.acquire();
            // something happens here
        } catch (InterruptedException e) {

        } finally {
            semaphore.release();
        }
    }

}
