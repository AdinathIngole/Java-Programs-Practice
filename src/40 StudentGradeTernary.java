import java.util.Scanner;

class StudentGradeTernary {
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

         System.out.println("Find Student Grade On marks :");

         System.out.print("Enter the Marks : ");
         int marks = input.nextInt();

         String grade = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");

         System.out.println("Student Category is " +grade);
     }
}
