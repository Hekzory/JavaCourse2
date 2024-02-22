package prac3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Semaphore Map");

        ThreadSafeMap threadSafeMap = new ThreadSafeMap(2);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i =  0; i <  3; i++) {
            executorService.submit(() -> {
                try {
                    threadSafeMap.put("Key" + Thread.currentThread().getId(), "Value" + Thread.currentThread().getId());
                    System.out.println("Put operation by " + Thread.currentThread().getId());
                    String value = threadSafeMap.get("Key" + Thread.currentThread().getId());
                    System.out.println("Get operation by " + Thread.currentThread().getId() + ", Value: " + value);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        executorService.shutdown();

        System.out.println("Synchronized set");

        ThreadSafeSet threadSafeSet = new ThreadSafeSet();

        executorService = Executors.newFixedThreadPool(3);
        for (int i =  0; i <  3; i++) {
            executorService.submit(() -> {
                threadSafeSet.add((int) Thread.currentThread().getId());
                System.out.println("Add operation by " + Thread.currentThread().getId());
                var value = threadSafeSet.contains((int) Thread.currentThread().getId());
                System.out.println("Get operation by " + Thread.currentThread().getId() + ", Result: " + value);
            });
        }
        executorService.shutdown();
    }
}
