
// sum of Digits of given number .
//Ex  num = 236   // 2+3+6
//output : 11
import java.util.Scanner;

class SumOfDigits {

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Welcome to sum of Digits : ");

         System.out.println("Enter the Number : ");
         int num = input.nextInt();
         int sum = sumOfDigits(num);

         System.out.println("Sum of Digits is = " +sum);

     }

     public static int sumOfDigits(int num){
         int sum = 0;
         while (num > 0){
             sum += num % 10;
             num /= 10;
         }
         return  sum;
     }
}
