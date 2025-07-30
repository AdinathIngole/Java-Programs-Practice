package in.example.practice_88;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestingFactorialCallable {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Future<Integer>> list = new ArrayList<>();

        try {
            for (int i = 0; i < 10; i++) {
                FactorialCalculater task = new FactorialCalculater(i);
                list.add(service.submit(task));
            }

            for (Future<Integer> future : list) {
                System.out.printf("\nResult is: %d", future.get());
            }

        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            service.shutdown();

            try {
                if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
                    System.out.println("Now Stop it .....");
                    service.shutdownNow();
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupted during shutdown.");
                service.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }
    }
}
