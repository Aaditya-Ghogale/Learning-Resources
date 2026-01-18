# Javascript.  
Javascript is a language made to interact in web browser.  
It helps us make web interactive and is a core driving force behind the web2 infra boom we see today. Just imagine how lonely web would have been if not for the interactiveness and we were just using the static pages.  
  
Well it was og made for to be used in browser only.  
  
Later someone (Ryan Dahl) thought why not make a runtime enviromnet that could process javascript code locally......hmm that might be intersting....and that's exactly how it went Javascript was put into backend stack and **Javascript successfully became a Full-Stack Language** So a behemoth emerged and javascript became a now all famous, start-up favourite languaage.  

So now onto next,  
  
Javascript can be included into HTMl in the HTML5 and we can use inline-Javascript and make javascript code inside the HTML code itself it can be done by:  
```html
  <script>
    console.log("Hello Duniya...How are you??")
  </script> 
``` 

The output will be displayed in console of the browser like.....this  
![Hello Duniya](./Images/Hello%20Duniya.png)  


There's somthing called external javascript where a seperate .js file is made and then is referenced in the html file with a source.

```html
 <script src="script.js" type="text/javascript"></script>
```

the output will be  
![external js](./Images/external%20js.png)

you can also run this external js file by opeining the cmd in its directory and running the cmd
```cmd
node script.js
```
Output should look like  
![cmd implement](./Images/node%20runnign%20of%20js.png)

But for this node should be present in ur system if not install via this   

https://www.geeksforgeeks.org/installation-guide/install-node-js-on-windows
   
  
Browser pop-ups.  
well for the below statements performance differs both in node as well as browser.  
 for these:  
 ```html  
   <script>
    console.log("Hello Duniya....How are you?")
    console.error("I feel that CS is getting harder.")
    console.warn("LLM Over-reliance is bad.......")
    alert("Lets try we dont have any way out any way.")
  </script>  
```

Browser output    

![browser o/p](./Images/browser%20inline%20js.png)  
  
For similar .js file:  
```js 
console.log("i am in script.js now")
console.error("I feel that CS is getting harder.")
console.warn("What is ai gonna do?")
alert("Lets try we dont have any way out any way.")
```

give this as a o/p  

![cmd external js](./Images/cmd%20external%20js.png)   

This clearly illustrates how node and browser react ddifferently to js node behaves in a programming language like manner while browser behaves in a more interactive manner.    


## Variables and Strings in I/O  

### Adding Variables and Attributes to Outputs.  

To add attributes directly in code we can directly add to the console parenthesis and with comma while to embed a variable in the output we need to put the variable in **${variable}** also the entire text must be enclosed in `` a.k.a. Backticks.  

see how its done 
![output](./Images/var%20embed.png)  

![output2](./Images/cmd%20node.png)
  
### Taking Input from User.  
  
**In browser environment.**
```js  
prompt()
```
This brings a pop up in the screen that can take input and do other tasks.


**In backend environment-- i.e. Nodejs**
  
As this is  a terminal based backend there can be no pop-ups so whe can do is use in-built node functions/modules to do the work.   
readline is a Built-in async CLI input for node apps.  
it can be imported using simple:  
```js  
import readline from "readline"
```  

But a simpler alternative can be the propmt-sync module that can be downloaded as a dependency.  
It can be downloaded by:  
```js
npm install prompt-sync
```

now this has both negatives and positives:  
`prompt-sync` is a library so you don't necessarily need to understand the underlying logic to function but can instead just understand what does what and be ready to go.   
Though this may be bad fundamentally as it is a lightweight low featured basic package devoid of advanced feattures like auto-complete, input validation, multi-line input etc.  
And like any other npm-package it just adds up the dependencies to the project also it may be risk as it can be compromised. Like latest i remember prettier was compromised.  
`So for sensitive applications readline is a better alternative.`  

But it is a good alternative when we need to understand  js pretty quickly and need to get ready to start and get going and we can later get our fundamentals ready.


We also have  a package named `Inquirer.js`  It can be installed using:  
```js  
npm install inquirer
```

Continuing on.... 

For browser   
```js  
  <script>
    const v=prompt("type here....")// accepts the value given by user in v and then stores there
    console.log(v)// prints the value stored in v
  </script>
```

![js browser io part 1](./Images/js%20browser%20io%20part%201.png)

![js browser io part 2](./Images/js%20browser%20io%20part%202.png)


For cmd  
refer io.js  
output:  
![cmd io](./Images/cmd%20io.png)  
  
 
## Data Types in JavaScript.  

Firstly we have the 5 basic primitive data types.  
  
- string - anything surrounded by "" or `` or '' a.k.a. (single, double) quotes or backticks.
- boolean - Simple `true` or `false`
- number - all numbers whether integers or decimals,  negative or positive.
- undefined - only type that is also  the value itself. used when you have noy set the value for something `yet` but will set something later on.
- null- Used when you want to set some value of someting as nothing `explicitly.` Used to find if anything is empty or non-existant.  
- We also have somethings like BigInt that store integers that cannot be stored in integers we also have symbol that will not be used much in this stage.  

  
## Variables in JavaScript.  

So for the variable side we have mainly 3 ways to declare a variable.  
Mainly `var`, `let` & `const`  

- `Var`- Var lets us declare and define variables directly like in other languages and we can let js identify the type. we can also change the value of the value of a var later on and it is perfectly fine.    
Also a thing to remember is that var is a function- scoped and is hoisted. 
So, in all
1. If you declare the var inside a function then that is accessible anywhere within that function. 
e.g.
```js
function a() {
console.log(v);
if (true){
    var v = "Hello world";  
}
console.log(v);
}
a(); 
``` 
```cmd
undefined
Hello world

=== Code Execution Successful ===
```
**Why??**  
Well, let me explain. when we declare a variable using **var** in a function the js compiler treats it like this 
```js
function a() {
var v;
console.log(v);
if (true){
   v = "Hello world";  
}
console.log(v);
}
a(); 
``` 
meaning that all var variables are declared at top. that is the reason the first console prints *undefined* cause at that moment the variable is **just declared but not defined** while later in the code the compiler finds the assigned value thus next console prints **"Hello world"**  

This code is insane in context of java , c++ etc as its like using something that you do not even have.  

Another, noteworthy thing is that if **not declared inside a function** the scope of a var is global. like the shown use first declare later can be used in scope of the braces. likewise for the var not declared in function scope is truly **global** and you can use first declare later anywhere in code.  


> **NOTE: This is one of reasons to avoid using of var keyword except if you have a specific usecase**
- `let` - let works similar  to var and  an be declared like any other language and  can also be changed. but it has its differences at deeper level.       
there are differences at deeper level we can cover that later.  
e.g.
```js
let v = "Hello world"  
```  

- `const` - well const is different the const here means constant meaning that variable declared here are  **constant** and cannot be changed even if they are re-declared it will show error.       
Well what is interesting is that  if you declare a array with const you can mutate it but what you cannot do is you cannot re-assign it a new array.Meaning, what const `freezes` is the reference of the array or object but not the array or object itself.   
e.g.
```js
const v = "Hello world"  
```    
So,  
this is possible.  
```js
const obj = {a:1};
obj.a = 2; //allowed, because what we are mutating is the object and the binding obj still points to the same object
``` 

while,
```js
const obj = {a:1};
obj = {};// Type error pops up at runtime.
//This happens because we try to reassign the obj to a new object which is not possible as reference of object is frozen.
```


## Block vs Function Scoped.  

Now as I am not going for basics and assuming all of us know programming words.  
Then letsss gooooo.........   
Well, `let` and `const` are both block scoped meaning that they can only be accessed in the blocks they are defined......*ahem....cough....local....variable......cough...*  
  

Consider this :  
```js
if{
console.log(x)
}
let x= 3

```
In above described situation neither const nor let can be used and above script will throw error because as stated `let` & `const` are block scoped meaining that they are accessible only within the block that they are defined.  
Also they cannot be accessed before they are declared meaning if you do some operation involving it and later declare it taht won't work.  


While `var` is function scoped meaning that it is accessible within the function that it was defined & if it wasn't defined within a function it is accessible im the `entire program`  
  
So here the magic also happens because of something called `Hoisting.`  
  
Well that is a topic to be studied in detail but to give a brief   
basically when you declare something using var it gets hoisted meaning made availabe at the top of the function and thus is availabe throughout teh function and can be used.This is a topic that i think i have intuitively described in the `var` section above so please refer there. 

So basically see below snippet.  
![hoist behaviour](./Images/Hoisting%20behavior.jpg)

so basically i did console.log twice in the code once before declaring it and once after. and as discussed in `var` subsection the 1st console gives `undefined` as o/p as hoisting is done for `v` and default value of a variable in js is `undefined` but after compiler reaches line 4 it finds the declaration and then it changes the value from `undefined to Hello world` so thus the second console.log prints `Hello world` once again this nature is called `Hoisting`

`In summary just know that let & const are block scoped and var is function scoped`
  
##   Operations & Type Coercions.  
 

 Well the Arithmetic Operations Here are similar to other programming languages i know,  
 well lets see :  
 `Arithmetic Operators.`
 - `+` is add. 
 - `-` is substract.
 - `/` is divide.
 - `%` is modulo.  
 - `*` is multiply.  
 - `**` is exponential.
   
`Unary Operators.`  
 - `--` is decrement.  
 - `++` is increment.
  
 `Assignment & Arithmetic Combo`  
 - `+=` add rhs to lhs & update lhs.   
 - `-=` substract rhs from lhs & update lhs.  
 - `*=` multiply rhs & lhs & update lhs.  
 - `/=` divide lhs by rhs & update it.  

 ### Operator precedence.

In JS operator precedence is same as C, because it is based on C.  
- 1. Scopes - what we call braces i.e.(  )
- 2. Unary - like ++, --, !, typeof.
- 3. Exponention - **.
- 4. Multiplicative - like *, /, %.
- 5. Additive - like +, -.
- 6. Relational - like <, >, <=, >=.
- 7. Equality- like ==, ===, !=, !==.
- 8. Logical AND - &&.
- 9. Logical OR - ||.
- 10. Assignment - =,+=, -=, *=, /=, %=, **=.

> Interesting experiment. 
I thought that the expressions x/=2+2 & x=x/2+2 would give same result as both are similar. but when i ran console. both did not see. taking '=' as dividing line js internally differentiates LHS from RHS. So, (x/)=(2+2)  is considered in 1st case and which results to x= x/(2+2). whereas in 2nd case it is already cleared.

```js
let x=20
x/=2+2
let y=20 
y=y/2+2
console.log(x);
console.log(y);
/*prints 
5
12
respectively*/
```

### Assignment, Equality & Relational Operator.
we have, 
- `>=` -It is the `Greator than or equal to` operator and it checks if LHS is Greator than or equal to RHS in which case it returns `True` else it retuens `False`.Rest working is same as `>`
- <= - It is the `Less than or equal to operator` and it checks if LHS is Less than or equal to RHS in which case it returns `True` else it retuens`False`. Rest working is  same as `>`
- `>` - It is the Greator than operator and it checks if LHS is Greator than RHS in which case it returns `True` else it retuens `False`.this also works weirdly than expected and like "==" and "!=" it checks only value so something like "3">2 returns `true`. so as said type coercion takes place here so to get the result you want make sure to change type before you do such operations and ensure type compatibility. A important note is that when type on both sides is string then what takes place instead of numeric comparison is lexicographic comparison. so while "3">2 may return `true` but, "10">"2" returns false.
- < -It is the Less than operator and it checks if LHS is Less than RHS in which case it returns `True` else it retuens`False`. Rest working is  same as `>`
- == - this is a `loose equality operator` it compares equality of value only meaning. for it true = 1 = '1' coz both given example  at end equate of 1 also important to remember is that for this `null = undefined` also equal are `[]=""` meaning a empty string is equal to a empty array. or even this `[1,2]="1,2"` is true.
- === - unlike above this here is `strict equality` meaning it cvhecks both value and type
- = - used to assign value to a variable or to be technical it connect the reference of a value to the reference of the variable. In Short, in JS, assignment binds a variable to a value
- != - works same as `loose equality ` and is called `loose inequaity operator`
- !== - works same as `strict equality ` and is called `strict inequaity operator`
> Note: Unless necessary, always use the Strict Equality (===) and the Strict Inequality (!==) operator. use other only if you know your shit.

   
### Type Coercion.  

Well by type coercion what we really mean that whenever we do arithmetic operation b/w 2 incompatible types in js it just converts one to other which is basically done via `implicit conversion`  
I will attach only one snip for understanding other i will just write it out pls crosscheck if in doubt.  
  
let's say, what we adding are 2 var's but to keep simple i will just write directly.  
`2+4` will give `6`.  
`7+"Eleven"` will give `7Eleven`   
In above the 7 got converted to string.  
`2 + True` & `2 + False` will result in `3` & `2` respectively as True & False are Boolean expressions & contain value 1 & 0 respectively .  
And, `eleven'+ true` will result in `eleventrue` as here bool is also converted to string.

But this idea where mostly all are converted to string holds true only when the operator in question is + i.e. concatenation. in other such as *, /, %, - it will try to convert to num for example
```js
let x='123'
let y=2
console.log(x-2)
// results in 121
```


```js
let x='hello'
let y=2
console.log(x-2)
// results in NaN i.e. Not a Number
//same result even if - is replaced by anything other than +
```

we also have some nuances here, 
```js
let x= "123"
let y=3
console.log(x+y)
//would result in 1233 asd it just appends 3 after converting to string

// to avoid this if you want to add then we have 2 options 
//1st
console.log(Number(x)+y)
//this converts the x into a number
let z="123px"
//this also works as number converter but it parses the argument and returns the integer or NaN respectively.
console.log(parseInt(z)+y)
console.log(Number(z)+y)

/*result after running:
1233
126
126
NaN

=== Code Execution Successful ===
*/

// a thing to notice is that parseInt only works if the target is in a format IS.... not any other even SI... where S= string and I = Integer coz parseInt runs till it find 1st string and then stops
let z1= "1op23"
let z2= "op123"
console.log(parseInt(z1)+y)
console.log(parseInt(z2)+y)
/*output is 
4
NaN
*/

// Similarly we have `parseFloat` that can grab Floating value.
```

Similarly we have `toString` that can convert other values to string and so on.  

### Logical Operators.
Here we have,
- `&&` - `&& (Logical AND)` is a short-circuiting operator that evaluates the left-hand side (LHS) first. If the LHS is falsy, it immediately returns the LHS without evaluating the right-hand side (RHS). If the LHS is truthy, it evaluates and returns the RHS. Because of this behavior, && returns one of its operands rather than a boolean, and it relies on JavaScript’s truthy/falsy semantics. This is why it is commonly used in if conditions to ensure that multiple expressions are truthy before executing a block.
Refer below to verify:  

`refer logical-ops.js to see the code run`
```js
let y= ("hi"&&false)
console.log(y)

let x= (false &&"hello")
console.log(x)

let d= (0 &&"hello")
console.log(d)

let z= (true&&true)
console.log(z)

let w= (true&&"This is Great")
console.log(w)

let a= ("hi"&&"red")
console.log(a)

let r =0
if (2>1 && 3>=3){
    r="rat"
}else{
    r="cat"
}
console.log(r)

let s =0
if (2>3 && 3>=4){
    s="rat" 
}else{
    s="cat"
}
console.log(s)

if (2>3 && "true"){
    console.log("so i was wrong") 
}else{
    console.log("so i was right")
}
/*
OUTPUT IS :
false
false
0
true
This is Great
red
rat
cat
so i was right

=== Code Execution Successful ===
*/
```
- `||`- `|| (Logical OR)` is also a short-circuiting operator that evaluates the LHS first. If the LHS is truthy, it immediately returns the LHS and skips evaluating the RHS. If the LHS is falsy, it evaluates and returns the RHS. Like &&, the || operator returns one of its operands rather than a boolean, which makes it useful for providing fallback or default values based on truthiness

- `!` - `! (Logical NOT) converts its operand to a boolean using JavaScript’s truthy and falsy rules and then negates it. It always returns a boolean value, making it useful for explicitly inverting conditions or for forcing boolean conversion when combined as !!value.

> Note: so now i came to know that Java and C++ also short-circuit `&&`  but the `&&` operator is strictly of Boolean tyoe in Java and C++ meaning In Java: `&&` is defined only for boolean `&&` boolean. It always returns a boolean "hello" is a String, not a boolean. So the `compiler rejects it before execution`.

## Flow Control Statements.
### Conditionals

We need to deal with conditions to deal with logical situations. like where we need to deal with situation based solutions.

Here just like other languages we have:
- if statement - here we have if and a condition. if the condition is satisfied then loc in the if block are executed else they are skipped.
- if, else statements- just like if but along with that there is a else block that is executed if the if is not satisfied. this can act as a default alternative to if.
- if, else-if, else statements- just like if and else but we have a extra else-if that allows an extra conditional alternative to if. Basically, it is a method to implement more than one if for a if-else blocks.
- ternary operator- it is a one lined conditioned statement that helps us implement logic similar to if-else. like it consists of a staement followed by `?` and 2 statemnts seperated by `:`. so how this works is that if the statement before `?` is true then the statement preceeding `:` is executed else the statement after `:` is executed. Finally `?:` together are identified as ternary operators.

``` js
const prompt = require("prompt-sync")();

if(true){
    console.log("this is a if statement");
}


if(2>3){
    console.log("this won't be logged because the condition is false");
}
else{
    console.log("this is the else statement");
}

let age=prompt("Enter your age:");

if(age>=18 && age<60){
    console.log("You are an adult!!");
}
else if(age>=60){
    console.log("You are a senior citizen!!");
}
else if(age<=0){
    console.log("You aint born yet!!");
}
else if(age<=18 && age>0){
    console.log("You are a minor!!");
}

let number=prompt("Enter a number:");

number%2==0?console.log("you have entered a even number"):console.log("you have entered a odd number");
/*
PS D:\Learning Resources\Learn Javascript\Oneshot by Learn with Tim> node .\conditionals.js
this is a if statement
this is the else statement
Enter your age:-2
You aint born yet!!
Enter a number:22
you have entered a even number
*/
```
### Switch statements.

what would you do if you want to execute in a lot of different manners depending on a variable. Say, for example you want to make a menu that operates depending on the day of the month in such a case you would have to deal with atleast 28 and atmost 31 different criteria based executions which would translate to 31 if, else if blocks and a else block if you want to deal with situations when no choice is met.  

So, here comes switch that takes a variable name as i/p and matches it to all cases and executes accordingly and executes a default block if no condition is met. Also each block is followed by a break statement that helps us exit the switch block as soon as the condition is met.
```js
const prompt=require("prompt-sync")()

let day=prompt("enter a day and i will tell you the menu :").trim()

switch(day.toLowerCase()){
    case "monday":
        console.log("Today is Monday and the menu is Pasta")
        break;
    case "tuesday":
        console.log("Today is Tuesday and the menu is Tacos")
        break;
    case "wednesday":
        console.log("Today is Wednesday and the menu is Burgers")
        break;
    case "thursday":
        console.log("Today is Thursday and the menu is Sandwiches")
        break;  
    case "friday":
        console.log("Today is Friday and the menu is Pizza")
        break;
    case "saturday":
        console.log("Today is Saturday and the menu is BBQ")
        break;
    case "sunday":
        console.log("Today is Sunday and the menu is Roasted Chicken")
        break;
    default:
        console.log("Invalid day entered")
}

/*
PS D:\Learning Resources\Learn Javascript\Oneshot by Learn with Tim> node switch.js
enter a day and i will tell you the menu :  MoNdAY
Today is Monday and the menu is Pasta
*/
```

## Arrays.
Arrays are different in js.  
In js arrays are much more flexible than in other languages.  
Here, arrays are mutable except when declared using `const`  
In case of arrays when const is used what is frozen is the reference to the array not the contents. so you can modify the contents of the array but you `cannot reassign the array`.
```js
let a=[1,2,3,4,5,6,7,8];
console.log(a);
a=[1,2,"hi",{name:"aadi",age:"100000"}];
console.log(a);

/*
Result:
PS D:\Learning Resources\Learn Javascript\JavaScript Speedrun for Programmer> node .\test.js
[
  1, 2, 3, 4,
  5, 6, 7, 8
]
D:\Learning Resources\Learn Javascript\JavaScript Speedrun for Programmer\test.js:17
a=[1,2,"hi",{name:"aadi",age:1000000}];
 ^

TypeError: Assignment to constant variable. 
Node.js v23.10.0
*/
```

As you can see this results in a process where you cannot use process that reassign an array. On arrays themselves for example if you declare a array then you try to reassign values using splice on other array or evwn itself it will not work just like.

```cmd
PS D:\Learning Resources\Learn Javascript\JavaScript Speedrun for Programmer> node .\test.js
[
  1, 2, 3, 4,
  5, 6, 7, 8
]
D:\Learning Resources\Learn Javascript\JavaScript Speedrun for Programmer\test.js:17
a=a.slice(2,3);
 ^

TypeError: Assignment to constant variable.

PS D:\Learning Resources\Learn Javascript\JavaScript Speedrun for Programmer> node .\test.js
[
  1, 2, 3, 4,
  5, 6, 7, 8
]
D:\Learning Resources\Learn Javascript\JavaScript Speedrun for Programmer\test.js:17
a=b.splice(2,4);
 ^

TypeError: Assignment to constant variable.
```

But in other cases where array is declared using `let or var` arrays can be reassigned.

But while arrays declared using const are not reassignable their contents can be modified. like doing this `a[10]=10;` to a  already declared array of size 4 is permissble showing that both size and contents of array are mutable.  
  
Another way to declare array is the old fashioned way of using `new` keyword.  
```js
const arr=new Array(10);
```
Now, we have cases when we want some or all indexes of an array filled with some values by default. For such cases we have `fill() function` if you do `a.fill("hi");` for a array `a` then it fills all indexes of the array with `"hi"`. now if you want to fill only certain specific values of the array with `"hi"` then you have to pass 3 things to the function namely value, start index and offset where offset means the number of indexes to be filled for example for a empty array of size `8` we can use a.fill("hi",3,4). which will fill 4 indexes starting from 3 which would result in `[<2 empty items>,"hi","hi","hi","hi",<2 empty items>]`.      


We also have cases where we want to fill the values from an string into a array. Here, we have `from() method`  that takes character one-by-one from the string and put them into index one by one in serialized manner. Below is example:  
```js
let a ="Hello Sam!!"
let b=Array.from(a);
console.log(a,b)
/*
Hello Sam!! 
["H","e","l","l","o"," ","S","a","m","!","!"]
*/
``` 

We also have some methods for array:  
- **push(value)** - This function can push a value in array. If you are familiar with concept of stack you know what push do right? well it inserts/appends the value to last index. `e.g. a=[1,2,3,4,5]; a.push("hi"); -----> [1,2,3,4,5,"hi"];`

- **pop( )** - This just removes last index value from array and retuens it. `e.g. for previous example a.pop() would return "hi" also if we console.log(a) after pop it would result in [1,2,3,4,5]`.  

- **shift( )** - Like pop this concept comes from queue where FIFO concept is held so this removes index just from the start index. `e.g. again referring to example from push(), a.shift() would result in ===> [2,3,4,5,"hi"]`  

- **unshift(value)** - this is like opposite of push where push adds value from end while unshift adds value from start index.  `e.g. again referring to example from push(), a.unshift("hi") would result in ===> ["hi",1,2,3,4,5,"hi"]`.  

- **indexOf(value)** - many a times we have to find index of a certain value in a array here indexOf() comes into play. It takes the value passed as reference and starts matching them to values at indexes starting from `left moving to right`. and returns index if match is found. what is interesting is that even if the value resides in multiple indexes in a array, Since it is index by index matching from `left --> right` only the 1st occurence of the value is considered. `eg taking example from unshift(value) as reference if we run a.indexOF("hi") we will get '0' as output`  

- **lastIndexOf(value)** - as name suggests it does same job as indexOf(value) but it finds last index of the value and returns.`eg taking example from unshift(value) as reference if we run a.indexOF("hi") we will get '6' as output`  

- **includes(value)** - it works exactly like indexOf() and lastIndexOf() but what it is meant to do is `only check` if value `exists` in `array`. So, while both of above return either index value of `-1` as result. what includes(value) returns is either `true` or `false`.`eg taking example from unshift(value) as reference if we run a.includes("hi") we will get 'true' as output`   

- **arr1.concat(arr2)** -  we may have scenarios where we  to merge 2 arrays so here we have concat() method that can join 2 arrays. It takes 2 arrays as i/p 1st array precedes it by a `.` while 2nd is passed to it inside its scope `(array2)`. when final array is made the elements of 1st array precede elements of 2nd array in terms of indexes. `e.g. a=[1,2]; b=[3,4] then a.concat(b)--> [1,2,3,4].` `Note: it also works on string.` 
  
-  **arr.join(value)** - we hav times when we want to have elements of array but we can't just cram them we need to have a seperater to serve as a distinguisher that seperates the values. here join(value) comes in it takes each element of array and appends them into a string with the `value` that was passed as parameter serving as seperator. `e.g. for a=[1,2,3]; a.join(" ") --> 1 2 3, whereas a.("~") would result in 1~2~3`.    

- **arr.slice(start index, end index)** - slice is a method used in situations where we want to have `a section of a array without affecting the original array` slice takes start and end index and copies them and values between them from the array that precedes it by `.` and returns these values as result. `e.g. taking the example from unshift() as reference if we run a.slice(2,4) we will get [2,3] as output.` ` Now you might expect 3 values but we get 2 why?> because just like fill(value,start,end) slice also includes start index and excludes end index meaning it might look like ` `start<=i<end`  

- **arr.splice(start index, offset)** - slice is a sligtly different version of slice. slice takes start index and offset and it then takes start index number as starting point and `cuts` offset number of values from the array and returns them. And, yes i said `cut` instead of `copy` so it literally removes them from array and returns them, therefore unlike slice splice does affect the original array.`e.g. taking the example from unshift() as reference if we run a.splice(2,4) we will get [2,3,4,5,"hi"] as output. and after that what will remain in a is ["hi", 1]` 

> Note : this is true for indexOf(value) & lastIndexOf(value). if no match for the value if found in the array we get `-1` as output because `-1 is default method in Js to represent "Not Found".`   

> Note: join() and slice() don't affect the original array.

## Array Destructuring  & Spread operator.

We often face scenarios where we have to face where we have to assign values to variablee from an array here we would traditionally do something like:  
```js
let arr=[1,2,3,4,5,6];
let a=arr[0];
let b=[1]; 
let c=arr.slice(2,5); 
```
now this may make loc significantly larger for some cases.  
  
Thus, for we have the concept of **Array Destructuring** and here we try to perform assignment using pattern matching

e.g. if you do this:  
```js
let a=[1,2,3,4,5];
let [b,c,v]=a;
console.log(b,c,v);
// 1 2 3
```


## for loop.

for loop is a looping method in JS. for loop is a loop that gate checks its block meaning at the entry of block we have the for parameter braces where the initialization, condition checker & increment/ decrement of intiated variable takes place.

Now for loop just works same like other languages.  
