package in.example.practice_83;

public class ThreadState extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.printf("\n From inside run %s ",getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
