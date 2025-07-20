# Packages & Access Modifiers.

-  Java or rather in any modern language there exists something called package.
- It may exist under any other name such as module, Namespace etc. in different languages.

- So what is package?  
Package is a way in java that helps us bind similar files or java classes together on basis of certain criteria.

- Why is it necessary?  
As you can see we can have **n** number of classes doing different things and they may be made for different purposes.  
Like your project can have 100 java file but to deploy the project you can use the packages to make it into a .jar or .var file that can be ran on client side to run the application......For ex. .exe is a famous packaging from the .Net architecture. 

- So we can use packages to categorize similar files to enable easier handling of classes.  
Like all database related files can be put under a single db folder, all utility related can be put under .util folder...and so on.  
The beauty is that we can have a package inside a package i.e. as in a nested package  
We can use this features to make packages that can be used as dependencies by others by importing to do certain tasks.  
Or you can use various packages to do various tasks and make a complete application.

  ![Package structure](./Images/packages.png)

above on right is the package name and on left is the package structure.

## Practical Implementation of Packages.

### Level ONE - Creating The package. 
So lets see practical implementation.  
Now, i have made 4 .java files A, B, C, Demo  
For a let me make that into  a package .First, Lets make A into a package. It can be done using this line:-  
```Java
package com.learn.java.packages
//this includes the A.java file into a package with structure that is given above like com\learn\java\packages\
class A {

} 
```

what that does is include the the said class into the package. But this will likely lead to error if the package is new and is now created here or if the file is creared somewhere else   
In such a scenario we can use IDE tools to fix this like below   
  ![Putting class in package](./Images/Include%20class%20in%20packages.png)

Now let me put B.java into another sub-directory in same package like here i put it in **com\learn\java\db** instead this shows how we can cluster files with  similar purpose together.  
This can make the package more usable if provided as a external dependency as well as makes the package well structured.  
As for the remaining C file just put in same directory as A.java.

  ![Package Structure](./Images/Package%20Structure.png)

Before moving on let me clear something on say you declare package like a.b.c.d; then the folder just above a in the hierarchy is **set as the root folder**  
This so called setting of root folder is not for namesake but has a significance...  
Let us understand till now you must have an idea of what packages are and what they do   
If not then think it like this packages are essentially a tree like structure eith branches and sub-branches  that help us organize files of similar nature together.  
And how do they do it.......Well by using **FOLDERS** what you are doing essentially is that you are grouping similar natured files together in folders in an organized, structured manner  
where '\' used in folder addressing is replaced by '.'  
So basically it helps us tell compiler that starting from com are not normal folder but packages  

Now root folder represents *top-level directory for a packages* it is a folder above the first component of the package like how in **com.learn.java.packages;** the root folders is Packages as the package in its entireity is located there.  
This also give the compiler a start point the below command can compile successfully only from the root node and from anywhere else it will lead to error:-
```Java
javac com/learn/java/packages/A.java
```  
It also prevents package mismatch errors as there can be multiple packages with same name 

### Level TWO - Accessing a package.
Now that we have looked into how to make a package let us also look into how packages are used or accessed.  
I will use Demo.java to access package files   

Now First, I directly tried to create a object of C class in Demo It didn't work:

![Object of C in Demo](./Images/C%20object%20in%20Demo%20--error.png)

So what happened?  
Well.......compiler can't obviously locate the C class....and it was somewhat to be expected as how can it know which C we were referring to 

So here comes main part we need to point out to compiler as to which address we are pointing to we do that using :-  
```Java 
import com.learn.java.packages.C;
//this helps you import only class C
import com.learn.java.packages.*;
//this imports entire package
```
## Access Modifiers.

Lets first B inherit A and declare some variables in A later we will see what happens  
Well i declared as int num [in class A] and then imported in Demo and then made object of A and then tried to access the variable But it gave error and this came up :

![error](./Images/access%20modifiers.png)

this happens because if u want the var to be accessible from other class it needs to be specified *"public"*  
So  what you see here is the wworking of *access modifiers*  
In Java by default classes are only accessible only in the subclass and not by every one. So, this num var that unless specified is inaccessible from Demo is possible if done by C which is in the same subclass  
So we have different types of access modifiers that set different types of access levels/visibility/accessibilty.  
But if i make it public it is accessible from anywhere but if i dont do it and keep default then, even thought the class B is child of A it still cannot access  num  
![Parent attributes inaccessible](./Images/parent%20class%20attributes%20inaccesible.png)  

**Why does this happen??**  
Just because B is not in same  package like A is in .packages while B is in .db  

**Soln???** 
Well we have protected accesss modifier that allows access only to same package and sublclasses.  


So in summary, we have 4 access modifiers which are as follows:-  
![Access modifiers](./Images/Access%20modifiers%20all.png)

Apart from that we also have the **Final keyword** lets go for it.  


## Final Keyword
We know the use of Final Keyword w.r.t. to variables..*it can be used to make variables constant*

But there are other uses that can be done as you know we made a public void show() method in class B and it inherits class A  
Now its impact can be seen below:  
![final method](./Images/final%20method%20in%20class%20A.png)  

![impact of final class on subclass](./Images/final%20method%20in%20class%20A---impact%20on%20B.png)

So setting a method as final in any class helps it being **non-overrideable.**

We can even  set class as final 
![final class](./Images/final%20class.png)
  
![final class impact](./Images/final%20class%20and%20its%20impact.png)

What happens when you set a class final is that it cannot be **inherited**.

So to Summarize, 
Final keyword if used with,
**Variables**- makes them constant.  
**Methods**- makes them non-overrideable.  
**Classes**- makes them non-inheritable.

### Done----Please Revisit Occasionally...a message to myself...
---

## Bye.... ≧◡≦