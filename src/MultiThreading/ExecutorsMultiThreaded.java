package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsMultiThreaded {

    public static void main(String args[]) {
        
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i=0; i<10; i++) {
            service.execute(new Work());
        }
        service.shutdown();
        System.out.println("fasdfa");
    }
}


class Work implements Runnable {

    @Override
    public void run() {
        Double arr[] = new Double[] {100.0, 20.0, 30.0};
      System.out.println("hello");

    }
}