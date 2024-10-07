package ReadWriteEX;

public class TestReading {
    public static void main(String[] args) {
//        ReadFromFile read = new ReadFromFile();
//        read.readFile("file.txt");

        CopyFile readWrite = new CopyFile();
        readWrite.copyFile("file.txt","readWrite.txt");
    }
}
