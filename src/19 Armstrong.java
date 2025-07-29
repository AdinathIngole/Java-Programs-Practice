
//Check Armstrong Number

import java.util.Scanner;

class Armstrong {
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         System.out.println("Check number is Armstrong or not ");
        // 153  1^3 + 5^3 + 3^3 = 153
         System.out.print("Enter the number : ");
         int num = input.nextInt();

         boolean isArmstrong = isArmstrong(num);
         if (isArmstrong){
             System.out.println("your number is Armstrong ");
         }else {
             System.out.println("Your number is not Armstrong ");
         }

     }

     public static boolean isArmstrong(int num){


         int noOfDigits = noOfDigits(num);

         int numCopy = num;
         int finalNumber = 0;

         while (num > 0){
             int lastDigits = num % 10;
             num /= 10;
             finalNumber  += pow(lastDigits ,noOfDigits);
         }
         return finalNumber  == numCopy;
     }

     public static int pow(int num1 , int num2){
         int result = 1;
         int i = 0;

         while (i < num2){
             result *= num1;
             i++;
         }
         return result;
     }

     public static int noOfDigits(int num){

         int digits = 0;
         while (num > 0){
             digits++;
             num = num/10;
         }
         return digits;
     }
}
