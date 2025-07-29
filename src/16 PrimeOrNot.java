
//Check Given number is Prime or Not

import java.util.Scanner;

class PrimeOrNot {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Welcome to Check Prime or not numbers..");

         System.out.println("Enter the Number : ");
         int num = input.nextInt();
          boolean isPrime = isPrime(num);

          if (isPrime){
              System.out.println("Your number is Prime.");
          }else {
              System.out.println("Your number is not Prime.");
          }
     }
     public static boolean isPrime(int num){

         int i = 2;
         while (i < num){
             if (num % i == 0){
                 return false;
             }
             i++;
         }
         return true;
     }
}
