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

- To use String as mutable type you need to use *StringBuilder* instead of *String class.*

- But as we know String is not really a Data type but rather a Class named **String** So, Similarly StringBuffer is also a Class named  **StringBuffer**.

- But, Unlike String that recieves ***special treatment*** from the jvm of being able to directly created variables like -

```Java
String name= "Aaditya";
```
StringBuffer doesn't get that treatment so you have to manually make var using object creation for the StringBuffer class -

```Java
StringBuffer name1 = "Aaditya";
// PLs note -  Above is invalid.
```

Instead what you need to do is,

``` Java
StringBuffer name1= new StringBuffer("Aaditya");
```

And Unlike String which can be modified directly by doing this,

```Java
name= name + "Ghogale";
```
- Also String in Java can be accessed like an Array withindex starting from 0 to n-1 so for name A will be 0 while a will end at 6

For StringBuffer there are other method that you need to use via using the created object.
```Java
name1.append(" Ghogale");
```

for example refer below

![Editing using StringBuffer](./Images/Stringbuffer%20edit.png)

- In ***String*** we also have some functions that are in-built and can be used easily

***Refer below for Example:-***


| Method Syntax                           | Description                                                                                   |
|----------------------------------------|-----------------------------------------------------------------------------------------------|
| `str.length()`                         | Returns the number of characters in the string.                                               |
| `str.charAt(index)`                    | Returns the character at the specified index (0-based).                                       |
| `str.substring(start)`                 | Returns a substring starting from the given index to the end.                                |
| `str.substring(start, end)`            | Returns substring from `start` to `end - 1` (end index is exclusive).                         |
| `str.equals(anotherStr)`               | Compares two strings for exact content match (case-sensitive).                               |
| `str.equalsIgnoreCase(anotherStr)`     | Compares two strings ignoring case differences.                                               |
| `str.compareTo(anotherStr)`            | Compares two strings lexicographically. Returns 0 if equal, positive if greater, else negative. |
| `str.isEmpty()`                        | Returns `true` if the string is empty (`""`), otherwise `false`. Takes no arguments.          |
| `str.toUpperCase()`                    | Converts all characters of the string to uppercase.                                           |
| `str.toLowerCase()`                    | Converts all characters of the string to lowercase.                                           |
| `str.trim()`                           | Removes leading and trailing white spaces.                                                    |
| `str.replace(oldChar, newChar)`        | Replaces all occurrences of `oldChar` with `newChar`.                                         |
| `str.contains(sequence)`               | Returns `true` if the string contains the specified sequence.                                 |
| `str.startsWith(prefix)`               | Returns `true` if the string starts with the given prefix.                                    |
| `str.endsWith(suffix)`                 | Returns `true` if the string ends with the given suffix.                                      |
| `str.indexOf(substring)`              | Returns the index of the first occurrence of the substring, or -1 if not found.               |
| `str.lastIndexOf(substring)`          | Returns the index of the last occurrence of the substring, or -1 if not found.                |
| `str.split(regex)`                     | Splits the string around matches of the given regular expression.                            |
| `String.valueOf(anyType)`              | Converts the given value (int, float, etc.) to a string.                                      |
| `str.toCharArray()`                    | Converts the string to a character array.                                                     |


> 🔍 **Difference Between `equals()` and `compareTo()`**
>
> - `equals(String another)` returns `true` or `false` depending on whether two strings have exactly the same characters (case-sensitive).
> - `compareTo(String another)` returns:
>   - `0` if strings are equal,
>   - A positive number if the calling string is **lexicographically greater**,
>   - A negative number if it is **less**.
>
> ➕ Use `equals()` when you only care about equality.
> ➕ Use `compareTo()` when you need to **sort or order** strings.


- see how we applied in *jshell*-

![String methods](./Images/String%20Functions.png)

![String methods--2](./Images/String%20Functions--2.png)

- Above it is -3 becoz what we are comparing here are 
```Java
"Aaditya"
"Aditya"
```

and comparison goes charater by character and what er compare are the ASCII values and we go on till first ***mismatch*** is found and then we just return the mismatch diffference like,

| Index | name.charAt(i) | name1.charAt(i) | Are they equal? | Result                    |
| ----- | -------------- | --------------- | --------------- | ------------------------- |
| 0     | 'A'            | 'A'             | ✅ Yes           | Continue                  |
| 1     | 'a'            | 'd'             | ❌ No            | return `'a'-'d'` = **-3** |


![String methods--3](./Images/String%20Functions--3.png)

![String methods--4](./Images/String%20Functions--4.png)

![String methods--5](./Images/String%20Functions--5.png)

- One thing we can observe from last picture above is that whatever action we do on String after all that when we display it it is ***UNCHANGED.***
- This once again hints as immutability of String. Similar thing happens when we conver String to char  array using methods 

![String methods--6](./Images/String%20Functions--6.png)

- But, if you want to save it as a char array then 

![String methods--7](./Images/String%20Functions--7.png)

- Just like above we also have some Methods for StringBuffer But while some are common between both others aren't applicable 

***Refer below for Example:-***

| Method Syntax                                     | Description                                                                 |
|--------------------------------------------------|-----------------------------------------------------------------------------|
| `sb.length()`                                    | Returns the number of characters in the buffer.                             |
| `sb.capacity()`                                  | Returns the current capacity of the buffer.                                 |
| `sb.ensureCapacity(int minCapacity)`             | Ensures that the capacity is at least the specified minimum.                |
| `sb.charAt(int index)`                           | Returns the character at the specified index.                               |
| `sb.setCharAt(int index, char ch)`               | Sets the character at the specified index.                                  |
| `sb.append(String str)`                          | Appends the specified string to the buffer.                                 |
| `sb.insert(int offset, String str)`              | Inserts the string at the specified offset.                                 |
| `sb.delete(int start, int end)`                  | Deletes characters between the start and end indices.                       |
| `sb.deleteCharAt(int index)`                     | Deletes the character at the specified index.                               |
| `sb.replace(int start, int end, String str)`     | Replaces characters between start and end with the given string.            |
| `sb.reverse()`                                   | Reverses the character sequence.                                            |
| `sb.substring(int start)`                        | Returns a new string starting from the given index.                         |
| `sb.substring(int start, int end)`               | Returns a new string from start to end-1 (like String).                     |
| `sb.indexOf(String str)`                         | Returns the index of the first occurrence of the substring.                 |
| `sb.lastIndexOf(String str)`                     | Returns the index of the last occurrence of the substring.                  |
| `sb.toString()`                                  | Converts the buffer to a `String`.                                          |
| `sb.setLength(int newLength)`                    | Sets the length of the buffer (truncates or pads with `\u0000` if needed).  |


> ⚠️ `StringBuffer` does not support many `String`-only methods like:
> - `isEmpty()`, `equals()`, `trim()`, `toUpperCase()`, `contains()`, etc.
>
> ✅ Use `sb.length() == 0` instead of `isEmpty()`.
> ✅ Always call `sb.toString()` if you need to use `String` methods.
>
> 🔐 Thread-safe: All `StringBuffer` methods are synchronized.

### Done----Please Revisit Occasionally...to myself...
---

## Bye.... ≧◡≦