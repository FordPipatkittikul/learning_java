package ConstructorEX;

class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        Person ford = new Person("ford",22);

    }
}
