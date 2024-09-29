package InterfaceEX;

public interface Countable {
    default void printInfo(){
        System.out.println("Countable info");
    }
}
