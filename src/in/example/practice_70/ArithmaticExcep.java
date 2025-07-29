package in.example.practice_70;

import java.util.Arrays;
import java.util.Scanner;

public class ArithmaticExcep {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer number .");
        int first = input.nextInt();
        System.out.print("Enter second integer number .");
        int second = input.nextInt();

        try {
            int result =  first /second;
            System.out.println("Result is = "+result);
        }catch (ArithmeticException exception) {
            if (exception.getMessage()
                    .equals("/ by zero")) {
                System.out.println("Divide by zero occurred.");
            } else {
                throw exception;
            }
        }
    }
}
