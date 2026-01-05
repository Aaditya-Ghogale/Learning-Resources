const prompt = require("prompt-sync")()

// This is a interesting thing in JS where what the above statement does is....  
// That it actually imports the prompt-sync module and makes it as a function then it assigns it to a function named prompt.  
//meaning whatever is being done to the prompt() function is basically handled by the prompt-sync module.  

const v=prompt("type something here....")// takes input and stores it in v

console.log(v)//prints the value stored in v    

