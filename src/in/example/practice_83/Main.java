package in.example.practice_83;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();

        System.out.printf("\n Create the Thread %s",t1.getState());

        t1.start();
        t1.join();
        System.out.printf("\n Thread finished %s",t1.getState());
    }
}
