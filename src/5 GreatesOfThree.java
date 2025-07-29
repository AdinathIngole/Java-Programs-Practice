import java.util.Scanner;

class GreatesOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int first = input.nextInt();
        System.out.println("Enter Second Number : ");
        int second = input.nextInt();
        System.out.println("Enter Third Number : ");
        int third = input.nextInt();

        if (first >= second && first >=third){
            System.out.println(first + " Number is Greatest.");
        } else if (second >= third) {
            System.out.println(second+ " Number is Greatest. ");
        }else {
            System.out.println(third+ " Number is Greatest. ");
        }
    }
}
