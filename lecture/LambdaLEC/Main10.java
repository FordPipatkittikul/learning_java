package LambdaLEC;

public class Main10 {
    public static void main(String[] args) {
        Calculator c1 = (a,b) -> {
            System.out.println("hiyaaaaaaa");
            return a + b;
        };
        System.out.println(c1.calculate(2,2));
        Calculator multiply = (a,b) -> a * b;
        Calculator plus = (a,b) -> a + b;
        Calculator minus = (a,b) -> a - b;
        Calculator maxxx = (a,b) -> Math.max(a,b);
        System.out.println("xxxxxxx" +maxxx.calculate(4,2));

        int two = execute(1,2,multiply);
        int minusOne = execute(1,2,minus);
        int three = execute(1,2,plus);
        System.out.println(two + " " + minusOne + " " + three);

        // built in functional functions
    }

    // using lambda expression as argument
    public static int execute(int n1, int n2, Calculator calculator) {
        return calculator.calculate(n1,n2);
    }
}
