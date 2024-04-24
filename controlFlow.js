//if statements

const cot=20;
if(cot>=20){
    console.log("you are eligible");
}

//nested if else statements

const cot1=30;
const cot2=40;
if(cot1==30){
    if(cot2==40){
        console.log("true");
    }
}
else{
    console.log("false");
}

const cot3=5;
if(cot3 ==4){
    console.log("true");
}
else if(cot3==5 && cot3<4){
    console.log("both true")
}
else{
    console.log("false")
}

//ternary operator

let age=16;
let drive;

age>=16 ?(drive="you can drive"):(drive="you can't drive");

//Another way using ternary operator
const age1=18;
let acc=age1>=18 ?"you can drive":"You can't drive";
console.log(acc);

//multiple ternary operator
const speed=90;
const message=speed==90?"too fast" :speed>=90 ?"fast":"Okay";
console.log(message);

//switch case
let day=3;
let dayName;

switch(day){
    case 1:
        dayName='Sunday';
        break;
    case 2:
        dayName='Monday';
        break;
    case 3:
        dayName='Tuesday';
        break;
    case 4:
        dayName='Wednesday';
        break;            
}
console.log(dayName);
