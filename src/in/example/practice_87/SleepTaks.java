package in.example.practice_87;

public class SleepTaks implements Runnable{
    @Override
    public void run() {
        Thread current = Thread.currentThread();
        System.out.printf("Started with Thread-%s",current.getName());

        try {
            Thread.sleep(getRandom() * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("Ended with Thread: %s\n", current.getName());
    }
    private int getRandom() {
        double random = Math.random() * 5 + 1;
        return (int) random;
    }

}
