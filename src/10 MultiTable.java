
//Create A program for Multiplication Table
import java.util.Scanner;

class MultiTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Table : ");

        System.out.print("Enter the number : ");
        int num = input.nextInt();
         multiplicationTable(num);

    }
    public static void multiplicationTable (int num){
    int i = 1;
    while (i <= 10){
        System.out.println("num " + num + " X " + i + " = " +(num * i));
        i++;
    }
    }

}
