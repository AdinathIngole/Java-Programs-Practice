import java.util.Scanner;

class PalindromeNo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Palindrome Numbers..");

        System.out.println("Enter the Number.. ");
        int num = input.nextInt();

        boolean isPalindrome = isPalindrome(num);

        if (isPalindrome){
            System.out.println("Your no is palindrome .");
        }else {
            System.out.println("Your no is not palindrome ");
        }

    }

    private static boolean isPalindrome(int num) {
        return num == reversNum(num);
    }

    public static int reversNum(int num){
        int newNum = 0;
        while (num > 0){ // num = 246
            int remainder = num % 10; // remainder = 6
            newNum = newNum * 10 + remainder; // 0 * 10 + 6 == 6
            num /= 10; // 246/10 = 24 Reapet on this number again till num is zero.

        }
        return newNum;

    }
}
