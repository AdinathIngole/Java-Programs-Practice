import java.util.List;

class StringFilterAndConcatenate {

     public static void main(String[] args) {
         List<String> strs = List.of("Adi Ingole", "bad",
                 "in coding java", "ghatiya", "ganda", "Best Youtube programming channel");

         String result = strs.stream()
                 .filter(str -> str.length() > 10)
                 .reduce("", (a, b) -> a + " " + b);

         System.out.println(result);
     }
}
