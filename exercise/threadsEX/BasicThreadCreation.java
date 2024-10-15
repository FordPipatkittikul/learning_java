package threadsEX;

public class BasicThreadCreation {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
           System.out.println("This is my thread");
        });
        thread.start();
    }
}
