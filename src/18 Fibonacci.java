import java.util.Scanner;

class Fibonacci {

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Welcome to fibonacci series ");

         System.out.println("Enter the number up to which series you want to print.");

         int num = input.nextInt();
         System.out.println("Here is the fibonacci series ");

         fibonacciSeries(num);

     }

     public static void fibonacciSeries(int num){

         if (num < 0) return;
         System.out.print("0 ");

         if (num == 0) return;
         System.out.print("1 ");

         int first = 0, second = 1;

         while (first + second <= num){
             int third = first + second;
             System.out.print(third + " ");

             first = second ;
             second = third;
         }
     }
}
