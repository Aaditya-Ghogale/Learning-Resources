/*
    * Object-Oriented Programming (OOP) in Java
    OOPs is a programming conceopt where everythong revolves around objects.
    It uses the concepts of classes , and objects to structure the code.
    * Key Concepts of OOP:
    1. Class: A blueprint for creating objects. It defines properties (attributes) and behaviors (methods). 
    Consider this as a template for creating objects.
    2. Object: An instance of a class. It contains data and methods defined in the class.
    Consider this as a specific item created from the class template.

    Now to make it clearer Take this example:
    An object is like a car it has mehods like  Start , stop , accelerate , brake , open door, close door ,play radio etc.
    and it has properties or attributes like color, model , year , engine, energy source , structure etc.


    now we also have 4 pillars of OOP:
    These are the fundamental principles that guide OOP design and implementation.
    
    1. Encapsulation : It states that the data (attributes) and methods (behaviours) of an object should be bundled together.
    It restricts direct access to an object's data and methods, allowing controlled access through public methods.
    Think of it like a capsule that contains everything needed to function.
    Consider the example of a car again, the car has a steering wheel, accelerator, brake, and other controls that allow you to interact with it,
    but you don't need to know how the engine works internally to drive it.


    2. Abstraction: It focuses on hiding the conplex implementation details and showing only the necessary parts to the user.
    It allows you to work with objects at a higher level without needing to understand their internal workings.
    For example, when you drive a car, you don't need to know how the engine works or how the fuel is injected.
    You just need to know how to use the steering wheel, accelerator, and brake to control the car.

    3. Inheritance: It allows a new class (subclass) to inherit properties and methods from an existing class (superclass).
    This promotes code reusability and establishes a hierarchical relationship between classes.
    For example, you can have a base class called "Vehicle" with common properties like "speed" and "fuel type",
    and then create subclasses like "Car" and "Motorcycle" that inherit those properties while adding their own specific features.

    4. Polymorphism: It allows objects of different classes to be treated as objects of a common superclass.
    It enables a single interface to represent different underlying forms (data types).
    There are two types of polymorphism:

    a. Compile-time polymorphism (Method Overloading): It allows multiple methods with the same name but different parameters to exist in a class.
    For example, you can have a method called "calculate" that can take different types of parameters (e.g., int, double) and perform calculations accordingly.
    
    b. Runtime polymorphism (Method Overriding): It allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
    For example, if you have a method called "start" in the superclass "Vehicle", the subclass "Car" can override it to provide its own implementation of starting the car.
    
    These four pillars of OOP work together to create a structured and organized approach to programming,
    
 */

 class oops{

    String name;
    int age;
    //this is a class named oops with two attributes: name and age
    //it defines the properties of the object that will be created from this class

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    } // this is a method that displays the information of the object it is the method that defines the behavior of the object
    //it can be called on the object to display its information
}

class Main{
    public static void main(String[] args) {
        System.out.println("This main class is ussed to demonstrate the concept of classes and objects in Java.[oops.java]");
        oops obj =new oops(); // this is an object of the class oops and this tells the compile to make a new object of the class oops this object has the properties and methods defined in the class
        obj.name = "Aaditya Ghogale"; // this sets the "name attribute of the object to "Aaditya Ghogale"
        obj.age = 21; // this sets the "age" attribute of the object to 21


        obj.displayInfo(); // this invokes the displayInfo method of the object to display its info.
        // this will print the name and age of the object to the console
        // this is how we can create an object of a class and use its properties and methods
        // this is the main method where the program starts executing
    }
}