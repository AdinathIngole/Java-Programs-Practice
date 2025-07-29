 class SumAvg2DArray {
     public static void main(String[] args) {
         System.out.println("welcome to Sum and Average of 2D Array :");

         int[][] array = ArrayUtility.input2DArray();

         int sum = sum2DArray(array);
         double avg = avg2DArray(array);

         System.out.println("Sum of given Array is : " +sum);
         System.out.print("Average of given Array is : " +avg);
     }

     public static double avg2DArray(int[][] array) {
         if (array.length == 0){
             return  0;
         }
         int rows = array.length;
         int col = array[0].length;
         int size = rows * col;
         int sum = sum2DArray(array);
         return (double) sum / size;
     }

     public static int sum2DArray(int[][] array) {
         int sum = 0;
         int i = 0;
         while (i < array.length){
             int j = 0 ;
             while (j < array[i].length){
                 sum = sum + array[i][j];
                 j++;
             }
             i++;
         }
         return sum;
     }
 }
