package in.example.practice_87;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadExcutorService {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);

        try {
            for (int i = 0; i < 10; i++) {
                SleepTaks task = new SleepTaks();
                service.submit(task);
            }
        } finally {
            service.shutdown(); // Initiate shutdown

            try {
                if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
                    System.out.println("EMERGENCY SHUTDOWN");
                    service.shutdownNow(); // Force shutdown
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupted while waiting for termination");
                service.shutdownNow(); // Force shutdown on interruption
                Thread.currentThread().interrupt(); // Restore interrupt flag
            }
        }
    }
}
