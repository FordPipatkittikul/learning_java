package OOPEX;

public class Bird extends Animal{
    // It will call superclass constructor first.
    // child class call the constructor from the parent class
    public Bird(){
        super("");
        setSound("chirp");
    }

    @Override
    public void makeSound(){
        System.out.println("Bird sound: " + getSound());
    }

}
