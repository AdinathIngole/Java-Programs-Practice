package in.example.practice_85;

public class RoadTest {
    public static void main(String[] args) throws InterruptedException {
        TraficLightThread red = new TraficLightThread(TraficColor.RED);
        TraficLightThread yellow = new TraficLightThread(TraficColor.YELLOW);
        TraficLightThread green = new TraficLightThread(TraficColor.GREEN);

        green.start();
        green.join();
        yellow.start();
        yellow.join();
        red.start();
    }
}
