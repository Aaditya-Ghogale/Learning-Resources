let arr1 = [1, 2, 3, 4, 5];
let [b1, c1, v1] = arr1;
console.log(b1, c1, v1);

let arr2 = [1, 2, 3, 4, 5];
let [b2, , c2, , f2] = arr2;
console.log(b2, c2, f2);

let arr3 = [1, 2, 3, 4, 5];
let [b3, , , ...y3] = arr3;
console.log(b3, y3);

let obj1 = { a: 1, b: 2 };
let { a: a4, b: b4 } = obj1;
let { a2, b2: b2_2 } = obj1;
console.log(a4, b4, a2, b2_2);

let arr4 = [1, 2, 3, 4, 5];
let y4 = arr4;
y4.push(6);
console.log(arr4);
console.log(y4);

let arr5 = [1, 2, 3];
let arr5Copy = [...arr5];
arr5Copy.push("Hello");
console.log(arr5, arr5Copy);

let arr6 = [1, 2, 3];
let b6 = [1, 2, 4, ...arr6];
console.log(b6);

let arr7 = [1, 2, 34, 5, 5];
let obj2 = { ...arr7 };
console.log(obj2);

let arr8 = [1, 2, 34, 5, 5];

function add(x, y, z, a1, d) {
    return x + y + z + a1 + d;
}

console.log(add(...arr8));

let personA = { name: "Alice", age: 30, city: "New York" };
let personB = { ...personA, name: "Bob" };
console.log(personA);
console.log(personB);

let personC = { name: "Bobby", ...personA };
console.log(personA);
console.log(personC);