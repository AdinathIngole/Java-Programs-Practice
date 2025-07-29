import java.util.Scanner;
 class SwapTwoNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.println("Enter the Second number : ");
        int num2 = input.nextInt();
         int temp ;

        System.out.println("Print both numbers before swapping is : " +"num1 = " +num1+ ", num2 = " +num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Print both numbers After swapping is : "  +"num1 = " +num1+ ", num2 = " +num2);
    }
}
