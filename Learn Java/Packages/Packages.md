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
 