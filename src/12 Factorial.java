import java.util.Scanner;

class Factorial {

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Factorial of Numbers : ");
         System.out.println("Enter the number : ");
         int num = input.nextInt();

         long fact = factorialNum(num);
         System.out.println("Factorial of " + num + " is " +fact);
     }
     public static long factorialNum (int num){
        if(num < 2 ){
            return  1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num){
            fact *= i;
            i++;
        }
         return  fact ;
     }
}

