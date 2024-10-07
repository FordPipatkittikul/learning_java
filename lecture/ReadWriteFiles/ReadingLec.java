package ReadWriteFiles;

import java.io.FileReader;
import java.io.IOException;

public class ReadingLec {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("file.txt")) {
            int data = reader.read();
            while (data != -1) {
                char character = (char) data;
                System.out.print(character);
                data = reader.read();
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}