 class IsSortedArray {

     public static void main(String[] args) {
         System.out.println("Welcome to check Array sorted or not :");

         int arr[] = ArrayUtility.inputArray();

         boolean isInc = isIncreasing(arr);
         boolean isDec = isDecreasing(arr);

         if (isInc || isDec){
             System.out.println("Your Array is Sorted.");
         } else {
             System.out.println("Your Array is not Sorted.");
         }
     }

     public static boolean isDecreasing(int[] arr) {
        int i = 1;
        while (i < arr.length){
            if (arr[i] > arr[i-1]){
                return false;
            }
            i++;
        }
         return true;
     }

     public static boolean isIncreasing(int[] arr) {

         int i = 1;
         while (i < arr.length){
             if (arr[i] < arr[i-1]){
                 return false;
             }
             i++;
         }
         return true;
     }
 }
