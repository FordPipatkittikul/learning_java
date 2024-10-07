package ExceptionEX;

public class HandlingExceptions {
    public static void validateNumber(int number){
        if (number < 0){
            throw new IllegalArgumentException("Number must be non-negative");
        }
    }
    public static void main(String[] args) {
        try{
            validateNumber(-2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
