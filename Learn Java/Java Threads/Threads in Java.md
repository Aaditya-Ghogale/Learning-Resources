# Java Threads.

In most real life applications today where we has come to a fast paced era, a large part of them require multiple processes to run parellely not in serial manner that normal that normal codes run taht i have ran till now.  
See,  
*Refer Code SerialCode.java*  

**Output:**  
  
![SerialCode.java output](./Images/Single%20process.png) 

SO as you can see normally we can do with object call method is that we can only run line wise so methods are called one by one.  
but imagine modern apps say a game and leave out the obvious multi- player but, even for the single player games such as a car race simulator there are multiple elements running in background except the main object itself eg. traffic signs, humans, other cars etc all af these need to run parellely/simultaneously in order to deliver a seamless experience.  

Now that we know the problem and requirement we also know why learning threads are imp in java.  
So, lets just do that.......  
  
## Threading.  

In java thread refers to smallest part of a process that aids in execution.

In Java by default only one thread runs at a time this thread runs throughout the code and goes 1 by 1 and jumps as instructed and returns after finishing job.  
  
Every code as we know starts from the main() method. and if it encounters something like:  
```Java  
A a = new A();

a.work();
```

It will now go to the A class using the a object then run whatever the work() method says then returns to main to resume execution.This is why only one by one processing is possible in single threaded environment.  
  
We can do **Multi-Threading in Java** using a inbuilt library called Thread.  
We need to make the classes where the multi threading is to be done the child class by using  
```Java
class A extends Thread  
```

now one more thing, the function that need to be ran simultanoeusly need to be named run like:  
```Java
public void run()
```

As this is how java recognizes what to multi thread. If you by any chance you need to name it something else then you need to use start() function with class object as this is default method that initiated run() internally from the Thread package.  
  
To give a high level view this is how multi-threading works.  

![Multiple threading](./Images/multi-thread%20depiction.png)  

*Please Refer the code of ThreadsJava.java*  
there for 2 classes running concurrently and each class has threading and in this it print a statement in loop for 20 times in one class and 30 times in another.   
So this output  
```cmd

D:\Learning Resources\Learn Java\Java Threads>java ThreadsJava
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:

D:\Learning Resources\Learn Java\Java Threads>
```

As you can see there is no pattern and it just randomly switches between 2 this happens as scheduler assigns resc to class depending on its cpu clock and  internal algorithm(remember fifo, round robin etc) or the order in which the process reach the scheduler.   
Now this phenomenon can be judged easily remember os where we had process allocation to critical section and how if it needs IO devices then it is removed from the critical section and then pushed to IO queue.  
I imagine from above output that class A could run 7 times in its alloted time while B could later run 8 and  this happened a few more times until all processes ended. *Brilliant example of Operating System Process Scheduling graph* 

This is a depiction:    

![process scheduler](./Images/process%20scheduler.png)

If we want to reduce the factor of randomness in this process there are some ways to do in the Threads Package.  

We can set **Priority** using  
```Java
obj.setPriority(10);
//here 1 being lowest and 10 being highest

//We can also use 
obj.setPriority(Thread.MAX_PRIORITY);
//THIS SETS TO MAX PRIORITY WHICH IS 10
```


This is new Output:
```cmd
D:\Learning Resources\Learn Java\Java Threads>java ThreadsJava
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hi from A:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:

D:\Learning Resources\Learn Java\Java Threads>
```

We can also do something to try to bring round robin like thread provides a function called sleep so see below:
```Java
Thread.sleep(10);
// this shows error as this is a checked exception.
//Remeber Check exception from exception handling .
// The errors java cares abt and recommends resolution.
// I just used Quick Fix of IDE Vscodeand try catch was made.
```

This is after keeping priority and also using 10 millisec sleep for both..
```cmd
D:\Learning Resources\Learn Java\Java Threads>java ThreadsJava
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hello from B:
Hi from A:
Hi from A:
Hello from B:
Hello from B:
Hi from A:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hello from B:
Hi from A:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hello from B:
Hi from A:
Hi from A:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:

D:\Learning Resources\Learn Java\Java Threads>
```
As You can see at the beginning 
- A got priority and printed but was put to sleep for 10 ms
- B entered as A was asleep but was also put to sleep similarly
- This repeated 5 more time and but after that somehow ratio of A: B became irregular.  
- Well I tried Round Robin..maybe  it has to do with locn of classes and therby the fetch time from memory or something else.......  



## Java Runnable 

Now  we know how Java Implements Threading. But here comes a problem as we saw that the Threading is implemented by Java using a Thread class which is inherited by a child class which can then use the inherited methods..........BUT here comes a problem 

Java does not suppoet **"Multiple Inheritance"** meaning a class can only inherit one class this is done to prevent clash of methods & attributes of same name in multiple parent classes.  


**So what now . . . . . . . . . ?**
  
Well We do have a workaroud in Java That's **Runnable** 
Runnable is a interface based on Thread.  
But since it is a interface it has some minute change. 
Here's the issue  
![Runnable missing methods](./Images/Runnable%20problem.png)

See Runnable pretty much misses all methods and attributes of a Java class  it only has a method named run()  
![Runnable class](./Images/Runnable%20class.png)  

So now what can be done.......

Well we can make 2 objects of Thread class like this 
```Java
    Thread obj3 = new Thread();
    Thread obj4 = new Thread();
```

Now as we know Thread class already has start method we can use these to initiate it.

```Java
obj3.start();
obj4.start();
```

then we can also pass obj made of classes as parameters in the Thread object creation

```Java
    Thread obj3 = new Thread(obj3);
    Thread obj4 = new Thread(obj4);
```

now when we call obj3 & obj4 it then calls obj and obj1   
This is possible as Thread class takes a runnable implementation as input.  
  
It worked.  

  
Now what will happen if some work is to be done after these e.g.  
```Java  
    obj3.start();
    obj4.start();
    System.out.println("Main thread work complete");
```  
we expect the output same as before just with an extra **Main thread work complete** at the end.  
But what happens is   
```cmd
D:\Learning Resources\Learn Java\Java Threads>java RunnableJava
Main thread work complete
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hello from B:
Hi from A:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hello from B:
Hi from A:
Hi from A:
Hello from B:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hi from A:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:

D:\Learning Resources\Learn Java\Java Threads>
```
  

So why does this happen  
Well,  As soon as the the thread t1 & t2 run and main is idle   
![main is idle](./Images/main%20is%20idle.png)

Then main will execute other steps.  

![main is not focused](./Images/main%20is%20not%20focused.png)

To prevent this and make sure it follows our expected we have to do something known as join method of thread class.  

join forces main to wait till t1 & t2 complete their work and then only proceed.  
![main is focused](./Images/main%20is%20focused.png)

this can be done by ddoing this  
```Java
    obj3.join();
    obj4.join();
```

A thing to notice is that join is a checked exception meaning it need try & catch.  
Let me make using ide  
```Java
 try {
        obj3.join();
        obj4.join();
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
```
this is output as expected.    
```cmd  
D:\Learning Resources\Learn Java\Java Threads>java RunnableJava
Hi from A:
Hello from B:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hi from A:
Hello from B:
Hello from B:
Hi from A:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hi from A:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Hello from B:
Main thread work complete

D:\Learning Resources\Learn Java\Java Threads>
```

