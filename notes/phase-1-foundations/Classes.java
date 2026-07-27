/*
*JAVA OOP- Procedural programming is about writing procedures that perform operations on the data
*OOp entails creating objects that contain both data and methods.
Adv of OOP
*It's faster
*Provides clear structure for the programs
*Helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
*Makes it possible to create full reusable applications with less code and shorter development time
* Difference btwn class and object
*Class is a blueprint or template for creating objects. It defines the properties and behaviors that the objects created from the class will have.
*Object is an instance of a class. It is a specific implementation of the class, with its own unique values for the properties defined in the class.
* When the individual objects are created, they can have different values for the properties defined in the class, but they will all share the same behaviors 
defined in the class.
*Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has 
attributes, such as weight and color, and methods, such as drive and brake.
*A class is like an object constructor, or a "blueprint" for creating objects.
* Create a Class in Java
-We need to use the keyword class to create a class in Java. The class name should start with an uppercase letter and follow camel case naming conventions. 
*Objects are created from classes using the new keyword, followed by the class name and parentheses. The parentheses can be used to pass arguments to the 
constructor of the class, which initializes the object's properties.
*For Example: Create an object call myOb and print the value x.
We can also have multiple objects of the same class, each with its own unique values for the properties defined in the class. For example, we can create another object called myObj2 and set its x property to a different value:
Classes myObj2 = new Classes();
myObj2.x = 10;
System.out.println(myObj2.x); // Output: 10 

*➡️Using Multiple Classes
*In Java, we can create multiple classes in a single file, but only one of them can be declared as public. The public class must have the same name as the file name. Other classes in the same file can be declared as package-private (default) or private, but they cannot be accessed from outside the file. If we want to use multiple classes in different files, we can create separate files for each class and use the import statement to access them. This allows us to organize our code into smaller, more manageable pieces and promotes code reusability.
* A class must have matching file name if it is declared as public. If a class is not declared as public, it can have any name and can be defined in the same file as the public class or in a separate file. However, it is generally recommended to define each class in its own file for better organization and maintainability of the code.

• Java Class Attributes
*Attributes are the variables that belong to a class. They are also known as fields or properties. In Java, we can define attributes in a class by declaring variables inside the class but outside of any method. These attributes can have different access modifiers, such as public, private, or protected, which determine their visibility and accessibility from other classes. We can also define default values for attributes, which will be used if no value is assigned to them when an object is created. For example, we can define an attribute called "name" in a class called "Person" as follows:
public class Person {
    public String name = "John"; // default value
}
    * Accessing Class Attributes
*We can access the attributes of a class using the dot notation. For example, if we have an object called "myObj" of the class "Person", we can access its "name" attribute as follows:
Person myObj = new Person();
System.out.println(myObj.name); // Output: John 
* Modifying Class Attributes
*For example: Set the value of x to 40
The final keyword is used to declare constants. A constant is a variable whose value cannot be changed once it has been assigned. In Java, we can declare a constant using the final keyword, followed by the data type and the variable name. For example, we can declare a constant called "PI" as folllows:
final double PI = 3.14159;
*We can also declare constants in a class by using the final keyword with the attribute declaration.
* Multiple Objects of a Class
*We can create multiple objects of a class, each with its own unique values for the attributes defined in the class. For example, we can create two objects of the "Classes" class and set their "x" attribute to different values as follows:
Classes myObj = new Classes(); // First Object
myObj.x = 5; // Set the value of x to 5 for the first object
Classes myObj2 = new Classes(); // Second Object
myObj2.x = 10; // Set the value of x to 10 for the second object
System.out.println(myObj.x); // Output: 5
System.out.println(myObj2.x); // Output: 10
* ➡️Java Class Methods
* Methods are functions that belong to a class. They define the behaviors that the objects created from the class will 
have. In Java, we can define methods in a class by declaring functions inside the class. These methods can have 
different access modifiers, such as public, private, or protected, which determine their visibility and accessibility 
from other classes. We can also define parameters for methods, which allow us to pass values to the method when it is 
called. For example, we can define a method called "greet" in a class called "Person" as follows:
public class Person {
    public String name = "John"; // default value
    public void greet() {
        System.out.println("Hello, my name is " + name);
    }
}
*/
public class Classes{
    int x;
    /*public static void main(String args[]){
        Classes myObj = new Classes();//First Object
        Classes myObj2 = new Classes();//Second Object
        myObj2.x = 10;//Set the value of x to 10 for the second object
        System.out.println(myObj.x);
        System.out.println(myObj2.x);
    }*/
   public static void main(String args[]){
    Classes myObj = new Classes();//First Object
    myObj.x = 40; // Set the value of x to 40
    System.out.println(myObj.x);
   }

}