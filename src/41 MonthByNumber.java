import java.util.Scanner;

class MonthByNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Month Calender : ");

        System.out.print("Enter Your Month Number :");
        int num = input.nextInt();

        String monthName = getMonthName(num);
        System.out.println("Month number is " +num+ " Month name is " +monthName);

    }

    public static String getMonthName(int num) {
        return switch (num){
            case 1 -> "Jan";
            case 2 -> "Feb";
            case 3 -> "March";
            case 4 -> "Apr";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "Aug";
            case 9 -> "Sep";
            case 10 -> "Oct";
            case 11-> "Nov";
            case 12-> "Dec";
            default -> "Invalid Month Number";
        };
    }
}
