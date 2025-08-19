# Java Collection API 

Java Collection API was not a primary part of java during its release but was rather released in the later 2nd version as a concept.  

So what collections do is that they provide us a method to make a group of objects and store them together. So collection is a "concept of java" rather than some method or piece of code.  

To implement this concept of "Java Collections" we have something called Java Collection Framework   **a.k.a.     JCF**  

What is JCF??  
Well JCF is a framework that gives the user a design as well as defines a set of rules that can be used to enforce the concept of Java Collections. What is also provided along with it are classes and soem interfaces.  
It provides some interfaces (Rules or blueprint) such as :  
- List = *Ordered, Duplicates are allowed.*  
- Set = *No duplicates allowed.*  
- Queue = *FIFO*  

These rules, designs, classes, interfaces etc are used to perform operations such as managing , sorting, searching etc  
It also provides some implementations of these such as :  
- ArraList, LinkedList, HashSet, PriorityQueue etc.  
  
## Java  Collection API  

Java Collections API are used to make tasks simpler.....matlab??  
These are ready-made functions/methods that can be used diretly to perform otherwise impossible or complex tasks. 
  
*Refer Collec1.java*  
  
For clarifying again So Java Collection APIs are basically methods/functions that are bundled in form to make some features accessile easier...Sounds familiar right?  
Well its a package  
well other such as system, string etc are need not be inported *exclusively* but for these they need to be   
  

  
  
But where are they??  
Well in utils package so they can be imported by:  
```Java  
import java.utils.ArrayList;//for specific implementation  
import java.utils.*; //just bring all in  
```  
  
What does array list do ?  
**It makes a dynamic sized array.**  
  

And what does this bring   
well change size in dynamic manner, we have to add using varname.add(value);, Also we can directly do this  
```Java
   ArrayList nums = new ArrayList();  
        nums.add(4);
        nums.add(5);
        ..
        ...
        System.out.println(nums);
```  
Well yes as you see I have successfully printed the array...*cough cough cough*... *Sorry* I have successfully printed the **ArrayList named nums**  
  
Result :  
![printArrayList](./Images/printArrayList.png)  
  
  