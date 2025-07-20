# Packages.

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

## Practical Implementation
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
  

Now that we have looked into how to 

