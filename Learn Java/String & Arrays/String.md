# String

- String are a method to store words or text in Java.

- But Unlike other languages Java's String are not primitive data type but rather a special class named **'String'**

- It can be accessed by using same method we use to access class:

```Java
String str=new String(original:"Aaditya");
```

The word 'original:' appears automatically in ide. *Refer First.java code in same directory* 

but, you get it right??


Basically unlike primitive variable where we store directly in other memory  here we make object of a class *String* and then we store the data.

**BUT As String hold important place in java so some changes were done so that they could be directly made like other variables [refer below] but behind the scenes Object is created. This clears the confusion as to why variables like int can be small but String must have 1st letter capital.**

```Java
String str = "Aaditya";
```

- So, String is **immutable** meaning that it cannot be changed once created.

- So, say if above code is ran then in memory in the **String Pool** it is stored.so Aaditya will be stored in say address 101 in the String Pool.

*Refer below image just Aaditya Ghogale is replaced by Naveen Reddy*

![String Creation](./Images/cr8%20string.png)

```Java
String str = "Aaditya";
str = str + "Ghogale";
```

In above code 1st line as stated before Aaditya is Stored at some address ( say 101 ) 

While the second line where another text is added. Unlike, you may think og string will not be updated **"Aaditya" ---x---> "Aaditya Ghogale"**  

But another string Aaditya Ghogale will be made ie **101** may have **Aaditya** unchanged But at **103** another string **Aaditya Ghogale** 

And the string **str** will now point to new string 

![Updating string](./Images/updating%20string.png)

Similarly, 
An Interesting fact is that if a new string is made and its value is something that already exists in the string pool then no new value will be added to the string pool but the new variable wil just point to that existing data 


*Say a new variable str1 = Aaditya Ghogale is made in the code then this wil just point to the address 103 we discussed earlier*

![new string](./Images/new%20string%20with%20same%20value.png)


- But it's not like we cannot have mutable string. 


