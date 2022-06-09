package Barriers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws Exception{
        Runnable task = new Task();
        ExecutorService service = Executors.newFixedThreadPool(3);
        // even if you sleep threads they will be executed simultaneously
        service.submit(task);
        Thread.sleep(100);
        service.submit(task);
        Thread.sleep(100);
        // Do not exit remaining threads
        service.shutdown();
    }
}
