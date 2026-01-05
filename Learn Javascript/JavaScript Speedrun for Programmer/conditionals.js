const prompt = require("prompt-sync")();

// This is a interesting thing in JS where what the above statement does is....  
// That it actually imports the prompt-sync module and makes it as a function then it assigns it to a function named prompt.  
//meaning whatever is being done to the prompt() function is basically handled by the prompt-sync module.
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