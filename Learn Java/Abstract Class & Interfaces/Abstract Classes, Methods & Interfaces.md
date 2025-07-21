# Abstract Classes, Methods & Interfaces.

Abstract classes are part of java that are essential and are used to perform abstraction and to show only necessary parts and hiding the complexity.  

## Abstract classes.
To give a better understanding let me tell you it with a example. You can find the .java files in the same directory as this and I will try to keep names  same as well as mention which class file to run to show which concept.  

So  let's get started  
So say we want to make a encyclopedia for animals.  
What would it have now as this is my idea to do so lets make it clear what it should do so First of, it should give the name of animal and it should also have age of that animal then it can also have something or some data unique to it.  
So now if it was just the first 2 things we could create arrays and store data in it like a name data and a age data and we could then use index of name in one array to access age from other array.  
But now we can for sure do some brute force approach here if we want. But what we set out to do here is not Problem solve but learn an new thing So...............  
*Drum rolls please.....*  
**Introducing abstract class ......**  
So here what we can do is that make a class and define the basic things that are name and age that we require as parameters here and then just keep it as it is and then let another class inherit it and then set parameters there...  
Say for example we can set class Animal and let it have String name as well as int age and the we can have multiple classes inherit them and have them add their individual changes to them  such as we cna have class Cat extend Animal and then we can add unique data of each or actions of each in their own inherited class.  

But there's this one thing We also need to ensure that the Base class Animal itself should not be instantiated so as to prevent awkward situation for eg. if user makes object of class Cat it will get all its data and methods but Animal itself is a general term so accessing it directly doesn't make any sense but rather it should be a frameworks as to how animals should be like all animals in this project at bare minimum should have name and age.  

***IF IN A HURRY READ FROM HERE***

So here comes **Abstract Class also Abstract methods**  
***An Abstract class is a class that cannot be instantiated by any means But it can be inherited and its methods can also be inherited just like other classes.***  
  
***SO, What is special you ask ??  Other than the part where it prohibits instanization it also has attributes that will be inherited by its sub classses thus  we cannot make abject of class Animal and access its name and We also have something like abstract method***  
  
***These are declared directly without any body and with the abstract keyword these methods are unlike normal ones  and must be created in the child class meaning each child class must have this method along with the body part else it will have compilation difficulty***  
  

***Continuing to our previous example say you decide to include makeNoise() as a abstract method in Animal class as you aim to ensure that our project has data of animal noise at the very least so this makes it a compulsion and helps in implementation. Plus it can also have normal methods with it***  

*Refer Animal.java for Practical implemetation*
*Use below cmd for implementation*  
```Java
javac Animal.java
java AbstractClasses
```
  
  *Adding snippets to show demonstration about the talked theory*  

  *Below shows how abstract class can't be initiated*
  
  ![no initiation possible](./Images/Abstracy%20class%20can't%20be%20initiated.png)  

  *Below shows how abstract methods must be defined in child classes.*

  ![Method compulsion](./Images/compulsion%20to%20implement%20abstract%20methods.png)

## Interfaces.  
Now before going to Interfaces let me tell in brief, Interfaces are almost same as abstract class In the sense that they also like abstract class and methods provide a basic framework that is followed by its successors.  
  
So, what's the catch you ask ??   
Well refer the AnimalInterface.java file and Catty.java in same directory and let me brief it.  
First Interface is defined using :  
```Java
public interface Animal
```  
Also instead of 
```Java
class cat extends Animal
```  

We use  

```Java
class cat implements Animal
```  

So every method in a interface is assumed to be abstract so you do not need to declare abstract just declare normal method and it will behave as abstract.   
Also the fields/variables in Interface are by default Final so the need to be initialized and if u want diff name for each subclass u need to declare in class itself.  
Abstract class have constructors as in essence they are class only But as interface are not classes they do not have constructors also they do not need one as all variables are **final** and all methods are **abstract** by **default**.  
Also all methods are **public by default**.  
***Also Final and most importanat part is that while Abstract classes cannot implement multiple inheritance like cat cannot extend both animals and birds....Interfaces can and thereby implementing multiple inheritance.***  
  
    
**Also what you can totally do is that you can extend a abstract class as well as implement interface at the same time. **    
  
Also as we did not make a package   but rather work with individual files the JVM isnt able to find the Interface file Di we need to compile file together.Use this,
```Java 
javac AnimalInterface.java Catty.java
```  
*Refer below snippets to see how Interfaces were dealt with*

![cr8 interface](./Images/interface%20declaration.png)
![use it](./Images/interface%20implement%20class.png)
![result](./Images/ran%20successfully.png)

---

## Bye.... ≧◡≦