
//Revers Number program.

import java.util.Scanner;

class ReversNum {

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Welcome to Revers Numbers..");

         System.out.println("Enter the Number.. ");
         int num = input.nextInt();

         int reversNum = reversNum(num);

         System.out.println("Revers Number is = " +reversNum);

     }

     public static int reversNum(int num){
         int newNum = 0;
         while (num > 0){ // num = 246
             int remainder = num % 10; // remainder = 6
             newNum = newNum * 10 + remainder; // 0 * 10 + 6 == 6
             num /= 10; // 246/10 = 24 Reapet on this number again till num is zero.

         }
         return newNum;

     }
}
