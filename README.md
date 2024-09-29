# Key Concepts and Terms

# Class

Class is a blueprint to create objects.

Class contain Data and actions which also known as attributes and method

Variables that belong to an object are usually called **attributes**

- subclass (child) - the class that inherits from another class

- superclass (parent) - the class being inherited from

# Constructors

Used to create an object of a class. It has the same name as the class.
It used to initialize instance variables of the object.

Instance variable is a variable that is declared within a class but outside any method, constructor, or block.

Every java have a constructor if you don't create it will be default constructor.

Constructors have no return type

**super()** for call a constructor in the parent class.
**this()** for call another constructor in its own class.

# Access Modifiers

keyword to control the visibility and accessibility of the class members.
Attributes, methods, constructors and other classes.
Best practice: choose the most restrictive access modifier that is appropriate

1) Public : Accessible from anywhere within the program.
2) Protected : Accessible from anywhere the same package and its subclasses outside the package
3) Default : No modifier. Accessible from anywhere within the same package
4) Private : Accessible from anywhere within the same class

## Static

**The static keyword** is a non-access modifier used for methods and attributes.
Static methods/attributes can be accessed without creating an object of a class.
because It belongs to the class.

## final
- When class is final, it cannot be extended.
- When method is final, it cannot be overridden.
- final variable can only be assign value once.

https://www.w3schools.com/java/java_modifiers.asp

# Method

## return type
    
    void : return nothing

## parameter and argument

    public class Main {
        static void myMethod(String fname) { // parameters
            System.out.println(fname + " Refsnes");
    }
    
        public static void main(String[] args) {
            myMethod("Liam"); // argument
            myMethod("Jenny");
            myMethod("Anja"); 
        }
    
    }

## getter and setter method

    The get method returns the variable value, and the set method sets the value.
    https://www.w3schools.com/java/java_encapsulation.asp

# Object/instance

An object is created from a class.

**instantiate** create an instance of a class.

Are mutable by default

# Packages

Always start with the package statement as the first executable statement of the Java file

They are group of classes. We should use packages to avoid name conflicts, and to write a better maintainable code.

Packages are divided into two categories:
1) Built-in Packages (packages from the Java API) such as Scanner
2) User-defined Packages (create your own packages)

# Variables

2 types of variables
1) Primitive types for primitive values
2) Reference types for objects

1) Primitive data types - includes byte, short, int, long, float, double, boolean and char
(https://www.w3schools.com/java/java_data_types.asp)

- For java, primitive type comparison can be done by ==
- Are immutable, but it doesn't mean you can change though just a new one get created when you override its value

2) Reference type - includes Class(any build in class such as String, Integer, Double, Boolean, Object, ArrayList), Array and Interface

- For reference types (such as objects), the == operator compares references rather than the actual content of the objects. 
This means it checks whether two variables point to the same object in memory, 
not whether their contents are equal.

- To compare the contents of reference types, you should use the .equals() method:

- UpperCase is a reference type
- Lowercase is a primitive type

## casting

Two types of casting:
1) Widening Casting (automatically) - converting a smaller type to a larger type size
2) Narrowing Casting (manually) - converting a larger type to a smaller size type
https://www.w3schools.com/java/java_type_casting.asp

# OOP

## Inheritance
The ability of a class to inherit properties and methods from a parent class.
Benefit: avoid duplicate code

## Encapsulation
Binding all data and methods together in one object.
Benefit: make sure that "sensitive" data is hidden from users.
https://www.w3schools.com/java/java_encapsulation.asp

## Abstraction
abstract all the difficult things. Only show user necessary things. hiding away the unnecessary details.

## Polymorphism
Many forms. Methods with the same name that can be executed on many objects or classes.

## hiding
Static members with the same name in parent and child class.

## Overriding, Overloading and Hiding

@override
**Overriding** : new implementation for a method that is inherited from a parent class.
**Overloading** : Providing multiple methods with the same name, but different signatures due to parameter list

# Interfaces
https://www.w3schools.com/java/java_interface.asp
Contract for a class what specifies which methods a class should have
Most interface method does not have a body, but It can have a body

## default method
It is a method that has a default implementation in the interface.
Class that implement an interface with a default body, don't need to
implement the default methods. But It is allowed to override it.

    interface ex{
        void method();
        
        default void myDefaultMethod(){
            System.out.println("A default method");
        }
    }


# Abstract
https://www.w3schools.com/java/java_abstract.asp

abstraction is the process of hiding certain details and showing only essential information to the user.

Abstract class: is a restricted class that cannot be used to create objects or instantiated.
(to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. 
The body is provided by the subclass (inherited from). Abstract method can be only exist in abstract class.


# Enums
https://www.w3schools.com/java/java_enums.asp
Special type of Class that has a fixed number of instances. Set of named constants(unchangeable).
Values of the enum are written in UPPERCASE.
can be compared by == syntax.

Enums with member

![enums.png](enums.png)

# post-increment and pre-increment
1) Pre-increment ( ++i ) increases the value of i before the value is used in an expression.
2) Post-increment ( i++ ) increases the value after the expression is evaluated.

# Switch Statement

A switch statement is a multiple-choice selection statement that's used when there are multiple choices for an expression 
and the condition is based on a predefined set of values.

    int day = 4;
    switch (day) {
        case 6:
            System.out.println("Today is Saturday");
            break;
        case 7:
            System.out.println("Today is Sunday");
            break;
        default:
            System.out.println("Looking forward to the Weekend");
    }

    // Outputs "Looking forward to the Weekend"

# Do-while loop 

Do-while loop  allows a program  to repeatedly execute block of code as long as given condition is met

    int i = 0;
    do {
        System.out.println(i);
        i++;
    }
    while (i < 5);
    
    // 0
    // 1
    // 2
    // 3
    // 4

# for loop

    for (int i = 0; i <= 10; i = i + 2) {   // start, stop, step
        System.out.println(i);
    }

# for each loop

    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
        System.out.println(i);
    }

# StringBuilder and StringBuffer

StringBuffer is thread safe but performance is slower StringBuilder.
Usually StringBuilder is the best choice unless you need to worry about thread safety

it is mutable string which unlike String.
https://www.javatpoint.com/StringBuilder-class

    class Example{
        public static void main(String[] args) {
            StringBuilder ex = new StringBuilder("Ford");
            ex.append(" loves food");
            
            String s = ex.toString();
            
        }
    }

# Date & Times
    // local
    import java.time.LocalDate; // immutable
    import java.time.LocalTime; // immutable
    import java.time.ZoneId; 
    import java.time.ZoneDateTime; 

    class Example1{
        public static void main(String[] args) {
            LocalDate x = LocalDate.now();
            LocalDate y = LocalDate.of(2000,4,25);  2000-4-25
            LocalDate z = LocalDate.parse("2011-4-25");  2011-4-25
        }
    }

    class Example2{
        public static void main(String[] args) {
            LocalTime a = LocalTime.now();
            LocalTime b = LocalTime.of(6,30,12);   h/m/s
            LocalTime c = LocalTime.parse("23-59-59");  h/m/s
        }
    }
    
    // Zone
    class Example3{
        public static void main(String[] args) {
            ZoneDateTime zdt1 = ZoneDateTime.now();
            ZoneDateTime zdt2 = ZoneDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Paris"));
        }
    }
    
# intelliJ syntax shortcut and Tricks

    psvm to create main method