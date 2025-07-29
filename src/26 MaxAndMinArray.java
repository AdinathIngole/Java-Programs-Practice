 class MaxAndMinArray {
     public static void main(String[] args) {

         System.out.println("Welcome to Max and Min of Array Element :");

         int arr[] = ArrayUtility.inputArray();

         int max = max(arr);
         int min = min(arr);

         System.out.println("Maximum Element of Array is : " +max);
         System.out.println("Minimum Element of Array is : " +min);

     }

     public static int min(int arr[]){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < arr.length){
            if (min > arr[i]){
                min = arr[i];
            }
            i++;
        }
         return  min;
     }

     public static int max(int arr[]){

         if (arr.length == 0){
             return  Integer.MIN_VALUE;
         }

         int max = arr[0];
         int i = 1;
         while ( i < arr.length){
             if (max < arr[i]){
                 max = arr[i];
             }
             i++;
         }
         return  max;
     }
}
