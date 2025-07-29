import java.util.Scanner;

class PasswordChecker {

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Welcome to password checker :");
         String password ;

         do {
             System.out.print("Please Enter Your Password :");
             password = input.next();
         } while (!isValidPassword(password));

         System.out.println("Thanks For Entering valid Password.");
     }

    public static boolean isValidPassword(String password) {

         return password.length() > 6;
    }
}
