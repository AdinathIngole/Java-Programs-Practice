package in.example.practice_66;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Square sq = new Square(4);

        System.out.println("Area of Circle is= "+circle.calculateArea());
        System.out.println("Area of Square is= "+sq.calculateArea());

    }
}
