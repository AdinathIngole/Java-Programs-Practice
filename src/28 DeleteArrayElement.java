import java.util.Scanner;

class DeleteArrayElement {

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Welcome to delete element from array .");
         int[] arr = ArrayUtility.inputArray();

         System.out.print("Enter the element which you want to delete from array : ");
         int numToDelete = input.nextInt();

         int[] newArr = newArray(arr ,numToDelete);
         System.out.println("Here is your new Array :" );

         ArrayUtility.displayArray(newArr);
     }

    public static int[] newArray(int[] arr ,int numToDelete) {

         int occ = OccurrencesArray.occurences(arr , numToDelete);
         if (occ == 0){
             return arr;
         }

         int newSize = arr.length - occ;
         int[] newArr = new int[newSize];

         int i = 0 , j = 0;
         while (i < arr.length){
             if (arr[i] != numToDelete){
                 newArr[j] = arr[i];
                 j++;
             }
             i++;
         }
         return newArr;
    }
}
