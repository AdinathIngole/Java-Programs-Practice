package in.example.practice_85;

public class TraficLightThread extends Thread{

    private final TraficColor color;

    public TraficLightThread(TraficColor color) {
        this.color = color;
    }

    @Override
    public void run() {

        System.out.printf("%s active\n", color);
        try {
            Thread.sleep(color.getOnTimeInMills());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Inactive\n", color);
    }
}
