import java.util.Scanner;

class MinAndMaxTernary {

     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.println("find Min and Max using Ternary : ");

         System.out.print("Enter the first number :");
         int num1 = input.nextInt();

         System.out.print("Enter the Second number :");
         int num2 = input.nextInt();

         MinAndMaxTernary ternary = new MinAndMaxTernary();
         int min = ternary.min(num1,num2);
         int max = ternary.max(num1,num2);

         System.out.println("Minimum number is : " +min);
         System.out.print("Maximum number is : " +max);
     }

    public int max(int num1, int num2) {
         return num1 < num2 ? num2 : num1 ;
    }

    public int min(int num1, int num2) {
        return num1 < num2 ? num1 : num2 ;
    }
}
