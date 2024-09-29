package ConstructorEX;

public class Animal2 {
    private String species;
    private int age;

    public Animal2(String species, int age){
        this.species = species;
        this.age = age;
    }


}

class Dog extends Animal2{
    private String breed;

    public Dog(String breed, String species, int age){
        super(species,age);
        this.breed = breed;

    }

    public Dog(){
        this("unknwon","dog",5);
    }

}

class Main2 {
    public static void main(String[] args) {
        Dog huski = new Dog("huski","dog",20);
    }
}