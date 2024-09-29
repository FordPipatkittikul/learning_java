package OOPEX;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("ahhhh");
        Bird b = new Bird();
        Parrot p = new Parrot();

        a.makeSound();
        b.makeSound();
        p.makeSound();
    }
}
