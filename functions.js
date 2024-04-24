function add(a,b){
    return a+b;
}
let sum=add(10,40);
console.log(sum);

function compare(a,b){
    if(a>b){
        return -1;
    }
    else if(a<b){
        return 1;
    }
    return 0;
}
let diff=compare(30,40);
console.log(diff);

//argument object

function obj(){
    let sum=0;
    for (let i=0;i<arguments.length;i++){
        sum+=arguments[i];
    }
    return sum;
}
function obj1(){
    let num=[4,1,2,4,1,3];
}

