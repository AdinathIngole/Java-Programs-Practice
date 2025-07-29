import java.util.Scanner;

class RightAnglePattern {

     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         System.out.println("Welcome to * Pattern System .");

         System.out.print("Enter the number Which you want to make no of * pattern  : ");
         int num = input.nextInt();

         rightAnglePyramid(num);
     }

     public static void rightAnglePyramid(int num){
         int rows = 0;
         while (rows < num){
             System.out.print("*");
             int col = 0;
             while (col<rows){
                 System.out.print(" *");
                 col++;
             }
             System.out.println();
             rows++;
         }
     }
}
