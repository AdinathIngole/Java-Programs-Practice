import java.util.Scanner;

class OccOfArrayElement {
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.println("Occurrence of Number in array :");

         int[] arr = ArrayUtility.inputArray();

         System.out.print("Enter the Number which you want to search Occ :");
         int num = input.nextInt();
         int occ = 0;

         for (int i : arr){
             if (i == num){
                 occ++;
             }
         }
         System.out.println("Occurrence of " +num+ " is " +occ+ " times in Array.");
     }
}
