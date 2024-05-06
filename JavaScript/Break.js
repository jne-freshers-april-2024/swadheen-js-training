
for (let i=1;i<=5;i++){
    for (let j=1;j<=4;j++){
        if(i+j==4){
            break;
        }
        console.log(i,j);
    }
    
}
//label statement
outer: for (let i=1;i<=5;i++){
    for (let j=1;j<=5;j++){
        if(i+j==4){
            break outer;
        }
        console.log(i,j);
    }
}
let i=0;
//in while loop
while(i<=5){
    i++;
    console.log(i);
    if(i==3){
        break;
    }
}

//in do while loop
let j=0;
do{
    i++;
    console.log(i);
    if(i==4){
        break;
    }
}while(i<5);