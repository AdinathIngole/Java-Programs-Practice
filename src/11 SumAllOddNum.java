
//Create a program to sum of all odd numbers from 1 to given specific number N.
import java.util.Scanner;

class SumAllOddNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Sum Of All Odd Numbers : ");

        System.out.println("Enter the number : ");
        int num = input.nextInt();

        sumAllOddNumbers(num);
    }
     public static void sumAllOddNumbers(int num){

        int i = 0;
        int sum = 0;
        while (i <= num){
            if (i % 2 !=0){
                sum +=i;
            }
            i++;
        }
         System.out.println("Sum of Odd numbers is = " +sum);
     }
}
