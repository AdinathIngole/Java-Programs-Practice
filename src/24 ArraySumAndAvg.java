import java.util.Scanner;

class ArraySumAndAvg {

     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         System.out.println("Welcome to Array Sum and Average : ");

         int numArray[] = ArrayUtility.inputArray();
          long sum = sum(numArray);
          double avg = avg(numArray);

         System.out.println("Sum of Array number is : " +sum);
         System.out.println("Average of Array number is : " +avg);
     }

     public static long sum(int nums[]){
         long sum = 0;
         int i = 0;
         while (i < nums.length){
             sum += nums[i];
             i++;
         }
         return sum;
     }

    public static double avg(int nums[]){
        long sum = sum(nums);
         double avg = (double) (sum / nums.length);
         return avg;
    }
}
