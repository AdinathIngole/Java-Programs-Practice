 class ArrayMaxNo {
     public static void main(String[] args) {
         System.out.println("Search Maximum Number in array :");

         int[] arr = ArrayUtility.inputArray();

         int max = Integer.MIN_VALUE;

         for (int num : arr){
             if (max < num){
                 max = num;
             }
         }
         System.out.println("Your Max Number is : " +max);
     }
}
