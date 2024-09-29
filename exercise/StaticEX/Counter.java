package StaticEX;

public class Counter {
    static int count = 2 ;
    static void increment(){
        count++;
    }

}

class Main{
    public static void main(String[] args) {
        System.out.println(Counter.count);
        Counter.increment();
    }
}
