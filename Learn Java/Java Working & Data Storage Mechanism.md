# Java Working

So, In this doc we will discuss the working of a Java Machine in Backend .
To run Java Programs you Initially download a kit from OpenJdk Or Oracle This is usually what we call a JDK meaning a Java Development Kit 

this JDK containd 2 things that help it develop applications
- *JRE- Java Runtime Environment.*
- *Java Virtual Machine.*

![JDK Contents](./Images/JDK_JRE_JVM.jpg)


When we Say that Java is a WORA (Write One Run Anywhere) Language JVM is the one that is performing the magic.
JVM usually has everything You need to run your application But sometimes some external files such as Libraries are necessary These are usually provided by the  **JRE**

## JVM - Java Virtual Machine

- Inside the JVM we have multiple areas or multiple parts 
in it we have Heap memory and Stack memory 

![JVM Memories](./images/jvm%20memories.png)

- Whenever a method is created or called a **Stack** is created that method say you make a main( ) method and a push method( ) then 2 stacks main & push will be made.
- And so The local variables that are made are thus pushed into that stack so if variables a, b, c are declared inside the method main then they will be put in that stack.

```java
class Demo
{
    public static void main(String args[])
    {
        int num= 9;
    }
}
```
So if you observe above example then when above code is run then  a stack **main**
will be made and it will have a variable num = 9 in it.

like wise let us see what happens when you create a object.

```Java
class Keyboard
{
    int keys;
    String color;
    
    public void pressed()
    {
        System.out.println("Signal sent"+color);
    }

    public void throwit()
    {
        System.out.println("Got hit");
    }
}

class Demo
{
    public static void main(String args[])
    {
        int num= 9;

        Keyboard obj = new Keyboard();
        obj.pressed();
        obj.throwit();
    }
}
```

so when a object is made 
in this line 
```JAVA
Keyboard obj = new Keyboard;
```
what we are saying to the compiler is that make a variable **obj** of **type = Keyboard** 
Here,
- obj = reference variable.
- Keyboard *(first one)* - is the class name *(the class is a reference data type)*. It defines the structure and behavior of objects of the type keyword.This class must be defined elsewhere in your code or imported
- new = it is a special keyword that tells the jvm that a object is to be created in the *heap* memory.
- Keyword( ) = this calls the constructor of the Keyword class to initialize the object.

now this object created means that all its methods and values are initialized in the heap and then in the stack a variable is created which is *obj* in our case along with it is also stored the address of memory where the initialized object's methods and values are placed. *[in given example 101 represents the memory address.]*

***Pls refer the below image for reference***

![object creation](./Images/jvm--01.png)

so here,
```Java
obj.pressed();
obj.throwit();
```
what we are doing is that we are using the initialized methods that are present in the *heap memory* for a particular object by accessing them using the corresponding address value stored in the *stack*.

