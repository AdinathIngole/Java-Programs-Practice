package in.example.practice_86;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadService {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            PrintNumbers task = new PrintNumbers();
            service.submit(task);
        } finally {
            service.shutdown(); // shut down the executor to avoid resource leaks
        }
    }
}
