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