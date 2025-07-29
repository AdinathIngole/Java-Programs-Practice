package in.example.practice_71;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) {
        String fileName = "java.txt";

        try(FileReader reader = new FileReader(fileName)) {
            int read = 0;
            do {
                read = reader.read();
                System.out.print((char) read);
            } while (read != -1);

        } catch (IOException e) {
            System.out.printf("An Exception Occurred .. %s",e.getMessage());
        }
    }
}
