package in.example.practice_79;

public class EnumTest {

    public static void main(String[] args) {
        System.out.println("Printing all days .");

        System.out.println(Days.MONDAY);
        System.out.println(Days.TUESDAY);
        System.out.println(Days.WEDNESDAY);
        System.out.println(Days.THRUSDAY);
        System.out.println(Days.FRIDAY);
        System.out.println(Days.SATURDAY);
        System.out.println(Days.SUNDAY);

        //Another Way

        for (Days days : Days.values()) {
            System.out.println(days);
        }
    }
}
