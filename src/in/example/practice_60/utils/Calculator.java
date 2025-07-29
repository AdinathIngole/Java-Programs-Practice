package in.example.practice_60.utils;

import in.example.practice_60.geometry.Circle;
import in.example.practice_60.geometry.Rectangle;

public class Calculator {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rect = new Rectangle(5,5);

        System.out.println("Area of circle is = " +circle.getCircleArea(5.5)+
                " Area of Rectangle is = "+rect.getRectangleArea(5,5));
    }
}
