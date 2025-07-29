import java.util.Scanner;

class LeftHalfPyramid {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to * Pattern System .");

        System.out.print("Enter the number Which you want to make no of * pattern  : ");
        int maxRows = input.nextInt();

        leftHalfPyramid(maxRows);
    }

    public static void leftHalfPyramid(int maxRows) {
        System.out.println("\nHere is Left Half Pyramid");

        int rows = maxRows;
        while (rows > 0){
            // this loop prints spaces
            int j = 0;
            while (j < rows - 1){
                System.out.print("  ");
                j++;
            }

            // this loop prints stars
            int i = 0;
            while (i <= (maxRows-rows)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }


}
