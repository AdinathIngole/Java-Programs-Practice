
// Determine Given Numbers is Positive ,Negative or Zero
import java.util.Scanner;

 class CheckPositiveNegativeNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();

        if (num > 0){
            System.out.println("Given number is Positive ");
        } else if (num < 0) {
            System.out.println("Given number is Negative");
        }else {
            System.out.println("Given number is Zero");
        }

    }
}
