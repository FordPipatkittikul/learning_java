package ReadWriteFiles;

import java.io.FileWriter;
import java.io.IOException;

public class WrtingLec {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("output.txt")){
            writer.write("EXXXXXXXX lecture");
        }catch (IOException e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }
}
