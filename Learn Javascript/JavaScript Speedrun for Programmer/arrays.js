var prompt=require("prompt-sync")();
var fruits = new Array(4);
//this makes an array with 4 empty slots
console.log(fruits); // Output: [ <4 empty items> ]

//we also have ways to fill a array with certain values.
//e.g.
var filler = prompt("Enter valur to fill the above empty value:");

fruits.fill(filler);
console.log(fruits); // Output: [ filler, filler, filler, filler ]  

fruits.fill(undefined);
console.log(fruits); // Output: [ undefined, undefined, undefined, undefined ]


//if you want to instead fill partialy what we can do is 
fruits.fill(filler,1,3);//what this fills is in condition (1[i.e. 2nd parameter is inclusive]<=index<3[i.e.3rd parameter is exclusive])
console.log(fruits); // Output: [ undefined, filler, filler, undefined ]

//you can also add in custom manner using array. methods

fruits=Array(2).fill(filler);
console.log(fruits); // Output: [ filler, filler ]
// you may think this works the same but what it does is make a new array with given size and fills it with given value instead of filling an existing array


//you can also fill arrays from a string

var str=prompt("Enter a String");
var strtoarr=Array.from(str);
console.log(strtoarr); // Output: [ 'H', 'e', 'l', 'l', 'o' ] if input is Hello


var a=["apple","banana","cherry"];
console.log(a[1]); // Output: banana

a= ["date","elderberry","fig"];
console.log(a[1]); // Output: elderberry

//when var is used arrays can be reassigned
a[6]="tomato";
console.log(a); 
console.log(a[4]); // Output: undefined
//Arrays in js are dynamic you can arbirtrarily add elements far after the last index and js automatically fills indexes in between with undefined or 'empty items'

let r=["hi this is a string",42,true,null,undefined,{name:"John",age:30},[1,2,3]];
console.log(r);

//arrays can hold elements of different types including strings, numbers, booleans, null, undefined, objects, and even other arrays.

console.log(r[5].age); // this is how to access object properties inside an array
// Output: 30
console.log(r[6][1]); // this is how to access elements inside a nested array
// Output: 2   


//we also have some built in methods to work on this like iyk the stack then you know push and pop concepts

let sizearr=prompt("Enter size of array:");
sizearr=Number(sizearr);
let stackalike=new Array(sizearr);

let checker=true;
while(checker){
let tempchoice=prompt("enter 1 to push and 2 to pop or 0 to exit [Note: intially array is empty] :")
if(tempchoice==="1"){
    stackalike.push(prompt("Enter value to push:"));
    console.log("Current Array:",stackalike);
}
else if(tempchoice==="2"){
    let poppedvalue=stackalike.pop();
    console.log("Popped value:",poppedvalue);
    console.log("Current Array:",stackalike);
}
else if(tempchoice==="0"){
    checker=false;      
}
else{
    console.log("Invalid Input");
}
}
//push adds element to end of array and pop removes element from end of array


//like wise we have shift and unshift for working with start of array which are reference to queue data structure
let queuealike=[1,2,3,4,5];
console.log("Before shift:",queuealike);
queuealike.shift(); //removes first element
console.log("After shift:",queuealike); // Output: [ 2, 3, 4, 5 ]

queuealike=[1,2,3,4,5];
console.log("Before unshift:",queuealike);
queuealike.unshift(prompt("enter a value to add at start:")); //adds element at start
console.log("After unshift:",queuealike);
//Output will vary based on input

console.log("Note: we can use push() and pop() to work together like a stack. While push and shift can work to function like a queue.");

// We also have some other methods like:

let samplearr=["tony","thor","steve","bruce","natasha"];
console.log("Original Array:",samplearr);
let tempo=prompt("Enter any one of above names[Note: no grammatical error allowed]:");
console.log("Index of above string is :",samplearr.indexOf(tempo.toLowerCase()));
//indexOf returns the index of first occurrence of given element in array or -1 if not found

console.log("array.indexOf() only matches the 1st occurrence of i/p value in array and is case sensitive");
console.log("the array.indexOf() returns -1 if i/p does not exist and array and thus doesnt match because -1 is default way in js to indicate 'not found'");
console.warn("Note: we also have array.lastIndexOf() which returns the last time any i/p value ocuured");
console.log("Similarly if you do not want index and just want to verify if a certain value exis or not in an array or a string.");
console.log("voila! we have array.includes() that returns true if value exists and false if not");

console.log("we can also combine 2 arrays using concat");
let arr1=[1,2,3];
console.log("First Array:",arr1);
let arr2=[4,5,6];
console.log("Second Array:",arr2);
let combined=arr1.concat(arr2);
console.log("Combined Array:",combined); // Output: [ 1, 2, 3, 4, 5, 6 ]


console.log("we can also convert arrays to strings while using something seperating them using join() ");
console.log(combined.join(" | "));
console.log(combined.join(" - "));
console.log(combined.join(" ~ "));
console.log(combined.join(" and "));

console.log("Note: join() does not change the original array it just returns a string with given separator");

console.log("We can also get a portion of an array using slice method");
let slicearr=["a","b","c","d","e","f","g","h"];
console.log("Original Array:",slicearr);
let portion=slicearr.slice(2,5);
console.log("Sliced Portion (2 to 5):",portion); // Output: [ 'c', 'd', 'e' ]
console.log("Note: slice(start,end) extracts from start index to end-1 index it operates in a similar manner to array.fill(value,startIndex, endIndex) both work on condition where [start<=i<end] and it also does not modify original array just like join()");

console.log("We also have splice() which works differently from slice().");
console.log("if we say that slice copies aportion of array and returns without modifying original array then splice just does the opposite.");
console.log("Where, it cuts a portiion from original and reurns the cut portion and modifies original array by removing that portion from it.");
console.log("Also, what is diffrerent is that while slice take (start, end) what splice takes is splice(start, offset)");
console.log("where offset is number of elements to be cut starting from start index.");
let splicearr=slicearr.slice(); // making a copy of original array to show difference between slice and splice.
console.log("Original Array for splice():",splicearr);
let splicedportion = splicearr.splice(2,4);
console.log("Spliced Portion (2,4):",splicedportion); // Output: [ 'c', 'd', 'e', 'f' ]
console.log("Modified Original Array after splice():",splicearr); // Output: [ 'a', 'b', 'g', 'h' ]


console.error("END OF ARRAY PART. THERE IS MUCH MORE BUT THESE BASICS WILL SUFFICE FOR NOW.");