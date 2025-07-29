package in.example.practice_60.geometry;

public class Circle {

    public double radius;

    public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircleArea(double radius){
        return Math.PI * Math.pow(radius , 2);
    }
}
