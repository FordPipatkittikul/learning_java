# Key Concepts and Terms

# Class

Class is a blueprint to create objects.

Class contain Data and actions which also known as attributes and method

Variables that belong to an object are usually called **attributes**

- subclass (child) - the class that inherits from another class

- superclass (parent) - the class being inherited from

# Constructors



# Access Modifiers

keyword to control the visibility and accessibility of the class members.

1) Public : Accessible from anywhere within the program.
2) Protected : Accessible from anywhere the same package and its subclasses outside the package
3) Default : No modifier. Accessible from anywhere within the same package
4) Private : Accessible from anywhere within the same class

## Static

**The static keyword** is a non-access modifier used for methods and attributes.
Static methods/attributes can be accessed without creating an object of a class.

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
- Are immutable but it doesn't mean you can change though just a new one get created when you override its value

2) Reference type - includes Class(any build in class such as String, Integer, Double, Boolean, Object, ArrayList), Array and Interface

- For reference types (such as objects), the == operator compares references rather than the actual content of the objects. 
This means it checks whether two variables point to the same object in memory, 
not whether their contents are equal.

- To compare the contents of reference types, you should use the .equals() method:

- UpperCase is a reference type
- Lowercase is a primitive type

# casting

Two types of casting:
1) Widening Casting (automatically) - converting a smaller type to a larger type size
2) Narrowing Casting (manually) - converting a larger type to a smaller size type
https://www.w3schools.com/java/java_type_casting.asp

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


# intelliJ syntax shortcut and Trucks

    psvm create main method