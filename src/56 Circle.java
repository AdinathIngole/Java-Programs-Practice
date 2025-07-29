import java.util.Scanner;

class Circle {
    double radius;

     public Circle(double radius) {
         this.radius = radius;
     }

     double getCircumference(){
         return 2 * radius *Math.PI;
     }
     double getArea(){
        return Math.PI * Math.pow(radius , 2);
     }

     @Override
     public String toString() {
         return "Circle{ " +
                 "radius= " + radius +
                 " Circle Circumference = " + getCircumference() +
                 " Area Of Circle = " + getArea() +
                 '}';
     }

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the radius of Circle : ");
         double rad = input.nextDouble();
         Circle cl = new Circle(rad);
         System.out.println(cl);
     }
 }
