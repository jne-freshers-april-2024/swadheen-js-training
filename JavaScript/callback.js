function isOdd(number){
    return number%2!=0;
}
function isEven(number){
    return number%2==0;
}
function filter(numbers,fn){
    let reasult=[];
    for(const number of numbers){
        if(fn(number)){
            reasult.push(number);
        }
    }
    return reasult; 
}
let numbers=[1,2,3,4,5,6,7,8];
console.log(filter(numbers,isOdd));
console.log(filter(numbers,isEven));

