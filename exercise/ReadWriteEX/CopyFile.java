package ReadWriteEX;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CopyFile {
    public void copyFile(String sourcePath, String destinationPath){
        try(FileReader reader = new FileReader(sourcePath);
            FileWriter writer = new FileWriter(destinationPath)
            ){

            int data = reader.read();
            while (data != -1) {
                char character = (char) data;
                writer.write(character);
                data = reader.read();
            }

        }catch (IOException e ) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
