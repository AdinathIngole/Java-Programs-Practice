import java.util.List;

 class StreamTest {
    public static void main(String[] args) {
        List<String> list = List.of("Adi","Ingole","Java" ,"Developer");
        list.stream()
                .forEach(element -> System.out.println(element));
    }
}
