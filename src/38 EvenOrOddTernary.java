import java.util.Scanner;

class EvenOrOddTernary {
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.println("find Even Or Odd using Ternary : ");

         System.out.print("Enter the number :");
         int num = input.nextInt();

         //EvenOrOddTernary ternary = new EvenOrOddTernary();
         //boolean evenOrOdd = ternary.checkEvenOrOdd(num);

         String result = num % 2 == 0 ? "Even" : "Odd" ;

         System.out.println("Your Number is " +result);

//         if (evenOrOdd){
//             System.out.println("Your number is Even :");
//         } else {
//             System.out.println("your number is Odd :");
//         }

     }
//    public boolean checkEvenOrOdd(int num) {
//        return num % 2 == 0 ;
//    }
}
