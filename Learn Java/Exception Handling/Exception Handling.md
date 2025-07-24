# Exception Handling.

## Errors in Coding.
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

## Exceptions.

before proceeding I have a quick concept to introduce.  
Now as we know errors exist. so what you need to know that each runtime exception results in a certian exception that is displayed at run-time.  
So we have 2 types of exceptions:  
***1. Checked Exceptions.***
***2. Unchecked Exceptions.***

the first  one is the one that compiler focuses on and if something can cause it the compiler at compile time iswlf will tell you to write a handling method for it these include IOException(); *happens say when you are writing a code that deals with input output but you do not havethe permisiion* and db exception().  

The latter as obviouss till now is one that compiler ain't caring about like one shown in later Demo.java code as well as Demopro.java code 

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

What exceptions do is that they stop the flow of a code.. say you wrote a code of 1000 lines and an error like above occured then what happens is that compiler stops execution in its entireity. to deal with this try , catch and finally block is made.

Well look into code Refer Demo.java of this directory.

SO see as we discussed we have a. Normal Statements & b. Critical statements...  
We also concluded that critical ones are the ones that have higher chances of running into error.  
What Try & Catch help us do is exactly this   
```Java
//b=0
try(){
    result =a/b;
}
catch(Exception e){
    System.out.println("Denominator musn't be 0");
}
```
  
Single try & catch block *{Demo.java}*:  
![Single Try & Catch](./Images/basic%20exception%20handling.png)

try block usually holds these *critical statements* while in catch what we do is that we tell what do if compiler encounters certain type of Exceptions. What we can also do is club multiple critical statemnts in the try block and in catch block we can write how to deal with each.   
But unlike Single one where you can just get away with writing Exception inside catch block like above you need to be more specific now. 

```Java
//b=0
int arr[]={1,2,3,4};
try(){
    result =a/b;

}
catch(ArithmeticException e){
    System.out.println("Denominator musn't be 0");
}
```
Multiple try catch*{Demopro.java}*: 
![Multiple Try & catch](./Images/multiple%20exception%20handling.png)

Also, consider this if you do not want your calculator to give 0 as output then is there  a way  to do this.....?  
Well yes there is a way to throw exception on your own.  
if you think carefully almost all packages are made of classes so is Exception  handling one...Don't believe look below..  
![Exception class](./Images/class%20ArithmeticException.png)

So what to do if we want to manually invoke a class which usually is automatically invoked...lemme think............Well you create a object so that is what i did. check above in multiple try & catch.  

There is also this concept where  
Suppose we have a set of methods that call each other say a,b,c where a calls b, b calls c  now if we get a exception occurs in c i.e. the last function then we have a 2 ways to deal with:   

**a.  write a try & catch block there.**
![exception for nested function calls](./Images/exception%20for%20nested%20function%20calls.png)  
  
**b. use throws to send the message that exception occurred to the method that invoked the current method till we reach a class that handles it** 
![throws keyword](./Images/exception%20handling%20for%20nested%20function%20calls.png)  

```Java
a(){
    b(); //calls b
}
b(){
    c(); //calls c
}
c(){
  
}

```

we can add throws followed by name of exception  and then it will follow it in chain and at one end should be class that can handle it


Check below code that does what we have discussed *Refer throwskeyworduse.java*

![use of throws keyeord](./Images/use%20of%20throws%20keyword.png)

## Finally block.

Remeber why we did all this and why we used try , catch , throws etc.   
Well because errors interrupted the flow of code and next code could not be performed.
so we have finally block  
what does this do?.  
code placed in this block will regardless of errors.  
like refer below code.  

![throws keyword implementation](./Images/use%20of%20throws%20keyword.png)  


![throws keyword implementation output](./Images/use%20of%20throws%20keyword%20output.png)


It can be used in placing code parts that you want to implement irrespective of anything such as closing db or closing scanner or anything e.g.-

```Java
Scanner sc=new Scanner(System.in);
sc.close();
```

---
## Bye.... ≧◡≦