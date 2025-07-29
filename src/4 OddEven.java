
//Check Numbers is Odd or Even
import java.util.Scanner;

class OddEven {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the Number : ");
         int num = input.nextInt();

         if(num % 2 == 0){
             System.out.println("Numbers is Even ");
         }else {
             System.out.println("Numbers is Odd ");
         }
     }
}

