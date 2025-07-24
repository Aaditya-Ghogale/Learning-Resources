# Exception Handling.

So when coding we make programs and these are then compiled by the JVM or its counterparts in other languages.  

The compiled files are then ran and this is also done by JVM.  
Now in any phase of this process there can be ERRORS:  
We can broadly classify all these errors into:-  
***1. Compile time Error.***  
***2. Logical Error.***  
***3. Runtime Error.***  
  
Now, Let's Understand these one by one
Lets go one by one Now First off we have Compile time errors that particularly occur during commpile time. These errors are of the best type as at comiple time itself the file won't compile and a error will occour Java handles this pretty well as code will not be compiled and it also show the particular part that caused it. Therefore java can also be said to be a strictly typed language.  

Next we have the Logical errors these are  the ones that are not technically incorrect but they include cases where the output is not which you expected or which you desired consider this,you wanted to write a code that gives a addition of 2 or more numbers when given as input. Say, you give 2,3 as input then o/p should be 5 but the code you wrote gives out 7 then there is a logical error as technically the code ain't wrong. but it just didn't do what you wanted it to do.  

Finally we have runtime errors there are errors that happen at runtime. Meaning at the time when you try to run  the compiled file. This can happen in various scenarios say for example if  had a file that had 10 dependencies and at compile time they were all there so there were no exceptions but now say when you run one of the files gets corrupted and deleted then This precompiled file will get a run time errors. This is just one example there can be many type of runtime errors such as ........*jUsT GOOGLE iT bUdDy. ~__~ *   

## Try and Catch Blocks.

Normal statements like below do not usually generate errors.  
```Java 
int a=10;
//or
for(int i =0;i<10;i++)
//etc.
```
But there are some *Critical statemnts* like below that usually have higher chances of getting in error.
*Pls. refer below.*
```Java
b=sc.nextInt();
a=sc.nextInt();
int div=a/b
//test 1: 2 & 4
//test 2: 0 & 4
```

So in above test 1 it will just work fine and also give 2 as output.

But when it comes to test 2 the denominator becomes zero it will throw an arithmentic error.  
*Refer below:*

![Aritmetic Error](./Images/Arithmetic%20error.png)


So to deal with all of this we have try & catch blocks

Why do we need these?? 

Well look into code Refer Demo.java of this directory.