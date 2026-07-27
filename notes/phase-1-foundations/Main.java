

public class Main {
    /*
    Methods are declared within a class, and are used to  perform certain actions, and they are also known as functions. In Java, a method is a block of code that is executed when it is called. A method can take parameters, which are values that are passed to the method when it is called. A method can also return a value, which is the result of the method's execution. Methods can be called on objects of a class, and they can also be called on the class itself if they are declared as static. 
    For example: Create a method named myMethod() in Main class and call it from the main method.

    ➡️ Access Methods with Objects
    We can access the methods of a class using the dot notation. For example, create a Car object named myCar, and call the fullThrottle() method on it as follows:
    Car myCar = new Car(); // Create a Car object
    myCar.fullThrottle(); // Call the fullThrottle() method on the myCar object
    
      
     */

    /*static void myMethod() { // Create a method named myMethod
        System.out.println("I just got executed!");
    }
    public static void main(String[] args) { // Call the method
        myMethod();
    }
        */
       //create a fullThrottle() method in the Car class and call it from the main method.
       /*public void fullThrottle() {
           System.out.println("The car is going as fast as it can!");
       }
       //Create a Speed() method in the Car class and call it from the main method.
       public void Speed(int maxSpeed) {
           System.out.println("Max speed is: " + maxSpeed + " km/h");
       }
       //Inside Main, we call the method by creating an object of the class and then calling the method on that object. For example:
       public static void main(String[] args) {
           Main myCar = new Main(); // Create a myCar object
           myCar.fullThrottle(); // Call the fullThrottle() method on the myCar object
           myCar.Speed(360); // Call the Speed() method on the myCar object with a parameter of 360
       }
           */
       /*
       The dot (.) is used to access the object's attributes and methods. In the example above, we use the dot notation to call the fullThrottle() and Speed() methods on the myCar object. The dot notation allows us to access the methods and attributes of an object, and it is a fundamental concept in object-oriented programming.
       To call a method in Java, write the method name followed by parentheses and a semicolon. If the method requires parameters, you can pass them inside the parentheses. For example, to call the Speed() method with a parameter of 360, we write myCar.Speed(360);. This will execute the Speed() method and print "Max speed is: 360 km/h" to the console.   
       A class must have matching file name if it is declared as public. If a class is not declared as public, it can have any name and can be defined in the same file as the public class or in a separate file. However, it is generally recommended to define each class in its own file for better organization and maintainability of the code.
       */
      /*
      ➡️ Using Multiple Classes
      In Java, we can create multiple classes in a single file, but only one of them can be declared as public. The public class must have the same name as the file name. Other classes in the same file can be declared as package-private (default) or private, but they cannot be accessed from outside the file. If we want to use multiple classes in different files, we can create separate files for each class and use the import statement to access them. This allows us to organize our code into smaller, more manageable pieces and promotes code reusability.
      */
     public void  fullThrottle() { // Create a fullThrottle() method in the Car class
        System.out.println("The car is going as fast as it can!");
        }

        public void Speed(int maxSpeed) { // Create a Speed() method in the Car class
        System.out.println("Max speed is: " + maxSpeed + " km/h");  
        }
        public void Gear(int gear) { // Create a Gear() method in the Car class
        System.out.println("Gear is: " + gear);     
        }
    }