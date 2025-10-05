# Javascript.  
Javascript is a language made to interact in web browser.  
It helps us make web interactive and is a core driving force behind the web2 infra boom we see today. Just imagine how lonely web would have been if not for the interactiveness and we were just using the static pages.  
  
Well it was og made for to be used in browser only.  
  
Later someone (Ryan Dahl) thought why not make a runtime enviromnet that could process javascript code locally......hmm that might be intersting....and that's exactly how it went Javascript was put into backend stack and **Javascript successfully became a Full-Stack Language** So a behemoth emerged and javascript became a now all famous, start-up favourite languaage.  

So now onto next,  
  
Javascript can be included into HTMl in the HTML5 and we can use inline-Javascript and make javascript code inside the HTML code itself it can be done by:  
```html
  <script>
    console.log("Hello Duniya......I am a noob in code..............Help.....................")
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
    console.log("Hello Duniya......I am a noob in code..............Help.....................")
    console.error("I feel that CS is getting harder.")
    console.warn("What is ai gonna do?")
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
Also a thing to remember is that var is a function- scoped and is hoisted and we will talk about this later on as this is a sort of advanced concept as of now.     
e.g.
```js
var v = "Hello world"  
```  
  
- `let` - let works similar  to var and  an be declared like any other language and  can also be changed. but it has its differences at deeper level.       
there are differences at deeper level we can cover taht later.  
e.g.
```js
let v = "Hello world"  
```  

- `const` - well const is different the const here means constant meaning that variable declared here are  **constant** and cannot be changed even if they are re-declared it will show error.       
Well what is interesting is that  if you declare a array with const you can mutate it but what you cannot do is you cannot re-assign it a new array.  
e.g.
```js
const v = "Hello world"  
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
In above described situation niether const nor let can be used and above script will throw error because as stated `let` & `const` are block scoped meaining that they are accessible only within the block that they are defined.  
Also they cannot be accessed before they are declared meaning if you do some operation involving it and later declare it taht won't work.  


While `var` is function scoped meaning that it is accessible within the function that it was defined & if it wasn't defined within a function it is accessible im the `entire program`  
  
So here the magic also happens because of something called `Hoisting.`  
  
Well that is a topic to be studied in detail but to give a brief   
basically when you declare something using var it gets hoisted meaning made availabe at the top of the function and thus is availabe throughout teh function and can be used. 

So basically see below snippet.  
![hoist behaviour](./Images/Hoisting%20behavior.png)

so basically see below for the same code i made some changes and then i ran ;  
For the 1st  cod ei declared console 1st and then declared var   
in this case irrespective of where teh function is called the o/p was `undefined`  
as js when it runs into a unintiated variable it assigns it as undefined then wheen it later reaches initialization it replaces the value.  
so here console just looks up and takes the current val as itt is and tehe compiler doesn't reach the var initializaion.   
  
In second time the var is placed above console here the `undefined ` is replaced by 10 so o/p is 10.  
  
In third time i just didnt declare var so here error came.  

In 1st and 3rd case both let & const would give reference error/

`In summary just know that let & const are block scoped and var is function scoped`
  
##  Arithmetic Operations & Type Coercions.  
 

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
   
### Type Coercion.  
Well by type coercion what we really mean that whenever we do arithmetic operation b/w 2 incompatible types in js it just converts one to other.  
I will attach only one snip for understanding other i will just write it out pls crosscheck if in doubt.  
  
say what we adding are vars but to keep simple i will just write directly.  
`2+4` will give `6`.  
`7+"Eleven"` will give `7Eleven`   
In above the 7 got converted to string.  
`2 + True` & `2 + False` will result in `3` & `2` respectively as True & False are Boolean expressions & contain value 1 & 0 respectively .  



  
