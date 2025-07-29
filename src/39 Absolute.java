import java.util.Scanner;

class Absolute {
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Absolute Number : ");

         System.out.print("Enter the Number : ");
         int num = input.nextInt();

         int abs = num >= 0 ? num : -num;

         System.out.println("Absolute Number is : " +abs);
     }
}
