package in.example.practice_85;

public enum TraficColor {
    RED(10000),
    YELLOW(3000),
    GREEN(10000);

    private final int onTimeInMills;

    TraficColor(int onTimeInMills) {
        this.onTimeInMills = onTimeInMills;
    }

    public int getOnTimeInMills() {
        return onTimeInMills;
    }
}
