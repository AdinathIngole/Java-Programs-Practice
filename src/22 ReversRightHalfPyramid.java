import java.util.Scanner;

class ReversRightHalfPyramid {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to * Pattern System .");

        System.out.print("Enter the number Which you want to make no of * pattern  : ");
        int num = input.nextInt();

        reversRightAnglePyramid(num);
    }

    private static void reversRightAnglePyramid(int num) {

        int rows = num;
        while (rows > 0){
            int col = 0;
            while (col < rows){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            rows--;
        }
    }
}
