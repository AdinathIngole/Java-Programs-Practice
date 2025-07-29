package in.example.practice_60.geometry;

public class Rectangle {

    public double length;
    public double breadth;

    public Rectangle(){

    }
    public Rectangle(double length , double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getRectangleArea(double length , double breadth){
        return length * breadth;
    }
}
