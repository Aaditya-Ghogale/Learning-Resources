# Arrays
While storing using primitive variables is convenient it can be hectic if we need to store n number of values for the same field Just like a .....Excel

 So, Arrays are born ....*tada   slow bg sound*

What arrays do is they enable you to is that store the same type of data under the banner of same variable in consecutive memory addresses ....these can be then accessed using the the var name followed by something called Index

We can create a array by using *the variable type followed by [] followed by the variable name*

*Let's look into how Arrays worked in  C/C++ [] represent array and we can also put numbers in it such as 1,100,999...etc. this will reserve that number of address spaces in the memory as we know that int takes 4 byte so [99] will occupy 396 bytes in memory and the indices will be from 0 to n-1 that is 0-98 here these indices are egged against the memory addresses that were reserved say addresses from 1201 to 1300 were reserved then varname[0] will give out value stored at 1201 [1] will give value at 1202.........& so on*

**BUT, While Java also works similarly like C/C++ for arrays.....There is a tene-tiny bit of change that is in Java does not allow you to do thissssss.... **int[9] dekho;** means that you cannot reserve space on prior basis but java will do that on its own So this makes it efficient for both dev as well as compiler i.e. space isnt wasted like there is no unused space and we do not need to have prior knowledge of the number of array elements and thereby limiting ourselves later on**

*Check Out Below:-*
```Java
int[] a; // preferred & conventional way in java
int b[];// is a legacy from C/C++ and works in java but is discouraged
int c[5]={1,2,3,4,5};//Does not work in Java
int c[] ={1,2,3,4,5};//Correct Version, Java decides the array size automatically after detection.
String[] name={Aaditya, Arya, Swaroop, Svaraj, Sanvi};
```
***BUT WE CAN SET A SIZE FOR STRING USING THIS AUTOMATIC DETECTION AT THE TIME OF STRING DEFINITION BUT ONCE CREATED THE SIZE IS SET THEN WE CAN'T ADD NEW ELEMENTS DOING SO WILL ONLY RESULT IN NULL POINTER EXCEPTION  IT WON'T WORK EVEN IF U LEAVE THE STRING UNDEFIND AND JUST CREATE IT ONLY BY DEFINING AGIAN WITH SIZE CAN IT WORK***

*REFER BELOW JSHELL EXPERIMENTS:-*

![sTRING ARRAYS JSHELL 1](./Images/String%20arrays.png)

![sTRING ARRAYS JSHELL 2](./Images/String%20arrays--02.png)

![sTRING ARRAYS JSHELL 3](./Images/String%20arrays--03.png)

You can also use For loop to accept Elements for arrays from User You just need to setup the for loop and put each elements in the arrays index accordingly 

*Refer Arrays.java for it*

You can also accept all the words in one line then split them and enter the Array you can use the **.split(\\s+)** command that splits based on whitspaces so even if you enter multiple spaces in a line it will be converted successfully which would not have happend if u use **.split("")**

**\\\s+ stands for whitespace in regular expression(Comment: Remember TOC theory of computation)**

*Refer Arrays01.java for more*

Also i had defined the size of array as 3 but as i entered 7 values it still worked fine.

Doubtful i did some research and came to find that .split instead of filling as itself in the array creates a dynamic array 
i.e. Creates new array with size = number of words


this is one of the result of Arrays01.java

![Arrays01.java--lesson](./Images/dynamic%20array%20due%20to%20.split%20command%20--refer%20Arrays01.java.png)


So we can alsouse foreach loop when working with arrays 
like 
```Java
String name[]= {"A","B","C"};
for (String n:name)
{
    System.out.println(n);
}
```
So above loop is a foreach loop that runs as  many times as the ArraySize and in each iteration the left hand sided variable is equated to the array indexes in an inceremental manner.


Now there's one more thing we can also make Array for a class But before that I tried to make 2 classes and in one i just defined 3 variables and made constructor for both using the in-built IDE features.

Goal was to use  class and make a object for other class and set its value during obj creation via constructor and then get that value back and print.

But a prob occured it didn't print well what it printed was entirely different something ...random.......unexpected.....Refer below-


*Check ArrayClass.java*

![String sout unexpected output](./Images/Class%20Array.png)

So I did some finding and here's the culprit

So Every almost class in java by default extends to a class named **"Object"** by default and within it there is a function called Tostring which is what  responsible for *printing an object directly* resulting in such behaviour.

So in above snippet when we try to print the object directly the result is as such

See below-

![Class Object- ToString Method](./Images/extends%20class%20Object.png)



So here 
```Java
public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
```

**This is not what we want....Right?**


So what can we do......
We can use Methos Overriding and then  we can make a new ToString method that works as we want and then Every time this will be executed....

![Overridden ToString Methos](./Images/extends%20class%20Object%20overridden.png)

We can now move on and look into how arrays of class what we create are not Array of object but array of object references.

```Java
Classname  objarrayreferencename[]= new Classname[number of references];
//these can be set later using
objarrayreferencename[index number]= new Classname(value1,value2);
//and so on;
```

refer ArrayCLass again asap.
![Making a object references array](./Images/Making%20a%20class%20array.png)


**Works as Intended.....**


### Done----Please Revisit Occasionally...
