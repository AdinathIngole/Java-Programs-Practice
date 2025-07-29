package in.example.practice_66;

public class Square extends Shape{

    private final double size;

    public Square(double size) {
        this.size = size;
    }

    @Override
    public double calculateArea() {
        return Math.pow(size,2);
    }
}
