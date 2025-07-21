# Guide for referring  Learn Java subrepo

## Basic Programs 


<details>
<summary>Java Working & Data Storage Mechanism.md</summary>

- This is a Readme that discusses all how java works and how it processes each step  till we get the final output  it also tells us how objects are a big part of java also how things happen on the memory end as objects are initiated as well as variables are made.
</details>

---
<details>
<summary>Demo.java</summary>

- This code is basic i/p o/p code that prints "Hello World".

- Also states working of JVM in breif and the importance of a main method.
</details>

---
<details>
<summary>empty.java</summary>

- This looks how JVm would react if a empty .java file is compiled and ran.
</details>

---
<details>
<summary>var_type.java</summary>

- This looks into different variable types in java also explores into a basic function.
</details>

---

<details>
<summary>ops.java</summary>

- looks into how arithmetic and logical operators work.... 
</details>


---

<details>
<summary>loops.java</summary>

- Looks into working of different types of loops in java.
</details>


## Object Oriented Programming.

<details>
<summary>oops.java</summary>

-  This is a more theory of OOPS and also looks into how Objects are created in Java and how they are used to access resources of another class from one class.
</details>

---
<details>
<summary>car.java</summary>

- Looks into basics of OOPS and  explores how OOPS are implemented in Java How Getters & Setters And private variables help  in implementing Encapsultation and how Inheritance. Also we also looking to Abstraction as to how we just use functions of a class from other just by making an object and not caring wtf is happening at inner level....Also we use Constructors to initialize values of variables ...also we look into use of the *this* keyword to set instance variable using the value if parameterized value in the setter method.

- All in all almost all OOPS except Polymorphism are covered.

- run this file using 

```cmd
java Main1 
```

</details>


---

<details>
<summary>Construct.java</summary>

- This Explores the working of the Constructors and how Getters & Setters help us make our code encapsulated.

- Access using AdvancedConstruct class.

```cmd
java AdvancedConstruct
```
</details>


---

<details>
<summary>polymorph.java</summary>

- This one goes into polymorphism quite well it does method overloading as well as method overriding.
- Also if we override a method of a parent class, by default child class method is  accessed  so i also did something that helped in accessing tthe parent class method in such a scenario.
</details>


## Strings

<details>
<summary>First.java</summary>

-  In here i tried printing String.
</details>

---
<details>
<summary>String.md</summary>

- For Strings i found it better to experiment on **jshell** better than coding for each also string is more on theory in this I looked into String class, StringBuffer Class, Their methods.

- Later we could do some code on Strings

</details>

## Arrays

<details>
<summary>Arrays.java</summary>

-  this is a basic code to accept String array elements and then print them out. I did it the usual way like it can only take one by one i/p not any advanced like u cannot write all i/p in one line .

- Finally then it prints the array i/p one by one.

- Above thimngs were done earlier but were later commented out
- I has a flash of inspiration and thought that what if we could take a integer input and then use that to create the string array object and the result is..........It is possible.
</details>

---
<details>
<summary>Arrays01.java</summary>

-  In this i tried same but the fun thing is i learn here that var_name.split(".\\\s+") [Note:-in readme.md txt there are three slashes but as visible] can help us accept i/p in a single line and then put them in line it takes words seperated by a space as strings and it does this as it recoginzes them via the .\\\s character

- Also if ur array size is fixed [say : 4] but the i/p is larger say of 10 words what it will not do is take just 4 words and ignore rest but instead it will fit 10 elements in the array .....i know it might be confusing but it is not.
- *Refer the .java file in comments the clarificaion is done*
</details>


---
<details>
<summary>ArrayClass.java</summary>

-  What i tried here is to use an array of a class.

- what it does that it uses object creation to make a array of references to multiple objects and these can be treated as array of classes

```Java
Student sarray[]=new Student[3];
     sarray[0]=new Student("Aaditya, SDE",1);
     sarray[1]=new Student("Aaditya, devops",2);
     sarray[2]=new Student("Aaditya, AI ML",3);
//for full version refer the .java file
```

- Also in this only we made 2 classes for one I made var in them and initiated them using the constructor and a parameterized one at that. I then made another class and then passed values using a object of the previous class and then I tried to print the object But, this printed some garbage.

- So I learnt why this happens [because of .toStrings() functions that is inbuilt in Object class] Also, that every class by default extends the Object class so when I print this specific methiod is called and that is the cause.

- So i made a function with same name in this class and made it @Override  and in this function i wrote the way i expect it to behave.

- Later as shown in above code snippet i tried how we can make a array of object  and then hoe i can give data to each object. In this code later i also printed this in which i knew that i can use for each to print even the object array.

```Java
 for(Student s2: sarray){
    System.out.println(s2);
 }

 //Here s2 is some random new var that we generally do in foreach 
 //sarray must be the name of object array
 // Amazing thing is that Student(i.e. class name) can be used instead of data type in the foreach loop
```
</details>

---
<details>
<summary>Arrays.md</summary>

-  This is a file that has  theory part for Arrays in Java Context as well as it has details of things i faced in execution as well as learnings during that for above listed code.

- May be updated later when i do more array related stuff or have more learnings in this context....
</details>
---

<details>
<summary> References
</summary>
Telusko a.k.a. Navin Reddy  

[Udemy Course](www.udemy.com/course/java-for-programmers-crash-course/)

Coding with John for Abstract classes, methods, Interfaces.  
*God He's a Saviour I banged my head on Abstract part for hours but just 7 fucking minutes of his vids did the job for me I felt like an Idiot* 
### **o(╥﹏╥)o**  

[Youtube](https://youtu.be/HvPlEJ3LHgE?si=GvDJBkQeRvYUjPHa)
</details>

## Bye.... ≧◡≦