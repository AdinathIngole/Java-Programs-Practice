import java.util.Scanner;

class OccurrencesArray {

     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.println(" Welcome to number of Occurrences of Array :");

         int arr[] = ArrayUtility.inputArray();

         System.out.print("Enter the number which you want to find occurrences :");
         int num = input.nextInt();

         int occurrence = occurences(arr,num);
         System.out.print("Your element was found " +occurrence + " times in the array ");
     }

     public static int occurences (int arr[] , int num){
          int occ = 0;
          int i = 0;
          while (i < arr.length){
              if ( arr[i] == num){
                  occ++;
              }
              i++;
          }
          return  occ;
     }
}
