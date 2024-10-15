package threadsEX;

public class RunnableInterfaceDemo implements Runnable{
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableInterfaceDemo());
        thread.start();
    }
    @Override
    public void run() {
        for (int i = 1; i < 6;i++){
            System.out.println(i);
        }
    }
}
