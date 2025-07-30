package in.example.practice_82;

public class Main {
    public static void main(String[] args) {
        HelloThread t1 = new HelloThread(1);
        HelloThread t2 = new HelloThread(2);

        t1.start(); //Created thread t1 and start
        t2.start(); //Created thread t2 and start
        t2.run();   // not create its only run main thread not t2 thread
    }
}
