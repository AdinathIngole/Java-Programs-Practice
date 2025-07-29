import java.util.Scanner;

class Calculater {
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         System.out.println("Welcome to Calculater : ");
         System.out.print("Enter the First Number : ");
         int num1 = input.nextInt();

         System.out.print("Enter the Second Number : ");
         int num2 = input.nextInt();

         System.out.print("what you want to do operation : ");
         String operation = input.next();

         int result = switch (operation){
             case "add" -> num1 + num2 ;
             case "sub" -> num1 - num2 ;
             case "mul" -> num1 * num2 ;
             case "div" -> num1 / num2 ;
             default -> 0 ;
         };

         System.out.println("Your Result is " +result);
     }
}
