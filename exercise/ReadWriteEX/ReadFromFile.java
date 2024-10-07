package ReadWriteEX;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class ReadFromFile {

    public void readFile(String filepath){
        try(FileReader reader = new FileReader(filepath)){
            int data = reader.read();
            while (data != -1) {
                char character = (char) data;
                System.out.print(character);
                data = reader.read();
            }
        } catch (IOException e ) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

}
