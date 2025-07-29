import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Frequency {
     public static void main(String[] args) {
         List<Integer> list = Arrays.asList(1,2,3,5,4,1,2,3,5,4,5,5,6,2);
         System.out.println(Collections.frequency(list,2));
         System.out.println(Collections.frequency(list,3));
         System.out.println(Collections.frequency(list,5));
         System.out.println(Collections.frequency(list,1));
     }
}
