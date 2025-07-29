 class ReversArray {

     public static void main(String[] args) {

         System.out.println("Welcome to Array Reversal :");

         int[] arr = ArrayUtility.inputArray();

         reversArray(arr);
         System.out.println("your revers array is :");
         ArrayUtility.displayArray(arr);
     }

     public static void reversArray(int[] arr) {
        int i = 0;
        while (i < arr.length/2){
            int swap = arr[i];
            arr[i] = arr[(arr.length-1) -i];
            arr[(arr.length-1) -i] = swap;
            i++;
        }
     }
 }
