package prac4;

public class Main {
    public static void main(String[] args) {
        SimpleExecutorService executor = new SimpleExecutorService(2);

        for (int i =  0; i <  10; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Executing task " + taskId);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Finished task " + taskId);
            });
        }

        executor.shutdown();
    }
}

