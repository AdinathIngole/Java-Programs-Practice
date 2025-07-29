import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

 class ComparatorSort {
    public static void sortInDesc(List<String> stringList){

        // These methods arrange Asc or Desc Not fixed
        //Collections.sort(stringList);

        //Using custom Comparator
        stringList.sort(new Comparator<String>() {
            // this compare return integer (0,1,-1)
            @Override
            public int compare(String str1, String str2) {
                if (str1.equals(str2)) {
                    return 0;
                } else if (str1.charAt(0) < str2.charAt(0)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mango" , "Peru" , "Apple" , "Banana" , "Orange");
        System.out.println(list);
        sortInDesc(list);
        System.out.println(list);
    }
}
