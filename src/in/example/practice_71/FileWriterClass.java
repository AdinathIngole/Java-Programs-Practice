package in.example.practice_71;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) {
        String fileName = "java.txt";

        //try with Resources
        try (FileWriter writer = new FileWriter(fileName)) {

                writer.write("This is the practice file of file writer.");
                writer.flush();
                System.out.print("Successfully Written In file ");
        } catch (IOException e) {
            System.out.print("An Exception occurred ");
            e.printStackTrace();
        }
    }
}
