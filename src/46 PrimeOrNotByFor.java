import java.util.Scanner;

class PrimeOrNotByFor {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.print("Welcome to Prime Number Checker :");
         System.out.print("Enter Your Number : ");
         int num = input.nextInt();

         System.out.println("Your No is " + (isPrimeNumber(num) ? "Prime" : "Not Prime"));
     }

    public static boolean isPrimeNumber(int num) {
        for (int i = 2 ; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
         return true;
    }
}
