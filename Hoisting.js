

greet();  
function greet() {
    console.log('Hi world');
}

//variable hoisting

console.log(a);
var a = 5;

//Pass-By value
function square(x) {
    x = x * x;
    return x;
}

let y = 10;
let result = square(y);
console.log(result); 
console.log(y);    

