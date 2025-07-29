package in.example.practice_71;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to File Handling...");
        System.out.print("Enter the filename which you want to find out : ");
        String fileName = input.next();

        try(FileReader reader = new FileReader(fileName)) {
            int read;
            //second way to read file by while loop (not do-while).
            while ((read = reader.read())!= -1){
                System.out.print((char) read);
            }

        }catch (FileNotFoundException exception) {
            System.out.printf(" %s not found exception ." ,exception.getMessage());
        }
        catch (IOException e) {
            System.out.printf("An Exception occurred %s" ,e.getMessage());
        }
    }
}
