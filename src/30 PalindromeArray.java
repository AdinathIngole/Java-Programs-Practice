 class PalindromeArray {

     public static void main(String[] args) {
         System.out.println("Welcome to palindrome Array :");

         int[] arr = ArrayUtility.inputArray();

         boolean isPalindrome = isPalindromeArray(arr);

         if (isPalindrome){
             System.out.println("Your Array is palindrome Array :");
         } else {
             System.out.println("Your array is not palindrome :");
         }
     }

     public static boolean isPalindromeArray(int[] arr){

        int i = 0;
        while (i < arr.length/2){
            if (arr[i] != arr[arr.length-1 -i]){
                return false;
            }
            i++;
        }
         return true;
     }
}
