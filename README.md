# Key Concepts and Terms

# Class
Class is a blueprint to create objects.

Class contain Data and actions which also known as attributes and method

Variables that belong to an object are usually called **attributes**

# Constructors

# Static
**The static keyword** is a non-access modifier used for methods and attributes. 
Static methods/attributes can be accessed without creating an object of a class.

# getter and setter method
The get method returns the variable value, and the set method sets the value.
https://www.w3schools.com/java/java_encapsulation.asp

# Object/instance
An object is created from a class.

**instantiate** create an instance of a class.

# private and public
**private** can only be accessed within same class

**public** can be accessed within same class or different class


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




