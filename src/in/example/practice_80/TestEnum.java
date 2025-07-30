package in.example.practice_80;

public class TestEnum {
    public static void main(String[] args) {

        System.out.println("Printing all days .");

        for (Day days : Day.values()) {
            System.out.printf("%s , %s\n",days ,days.getType());
        }
    }
}
