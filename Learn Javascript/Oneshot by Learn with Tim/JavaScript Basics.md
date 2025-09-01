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

while 