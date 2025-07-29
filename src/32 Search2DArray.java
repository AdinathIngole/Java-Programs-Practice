import java.util.Scanner;

class Search2DArray {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to 2D Array : ");
         int[][] array = ArrayUtility.input2DArray();

         System.out.print("Enter the number which you want to search : ");
         int num = input.nextInt();

         boolean isFound = searchElement(array,num);

         if (isFound){
             System.out.println("your number is found in Array :");
         } else {
             System.out.println("your number is not found in Array :");
         }
     }

    public static boolean searchElement(int[][] array, int num) {

         int i = 0;
         while (i < array.length){
             int j = 0;
             while (j < array[i].length){
                 if (array[i][j] == num){
                     return true;
                 }
                 j++;
             }
             i++;
         }
         return false;
    }
}

