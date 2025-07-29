
// Find the GCD of two numbers

import java.util.Scanner;

class GCD {

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Welcome to GCD of two numbers .");

         System.out.println("Enter the first number :");
         int first = input.nextInt();

         System.out.println("Enter the second number :");
         int second = input.nextInt();

         int gcd = gcd(first ,second);
         System.out.println("GCD of numbers is : " +gcd);
     }

    public static int gcd(int first, int second) {
         int gcd = 1;
         int least = least(first,second);
         int i = 2;
         while (i <= least){
             if (first % i == 0 && second % i == 0){
                 gcd = i ;
             }
             i++;
         }
        return gcd;
    }

    public static int least(int first, int second) {

         if (first < second){
             return first;
         }else {
             return second;
         }
    }
}
