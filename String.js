
const string1="this is primitive";
const string2="this is alos primitive";
const string3="this is another primitive string";

console.log(string1.charAt(1));

console.log(string1[2]);
console.log(string1.includes("is"));

const string4 = string1.split(" "); 

for (let i = 0; i < string4.length; i++) {
    const word = string4[i]; 
    for (let j = 0; j < word.length; j++) {
        console.log(word.charAt(j));
    }
}

console.log(string1.codePointAt(1));
console.log(string1.length);
console.log(string1.charCodeAt(2));
console.log(string1.concat(string2));
console.log(string1.indexOf("p"));
console.log(string1.lastIndexOf("i"));
console.log(string1.startsWith("t"));
console.log(string1.trim);
console.log(string1.substring(3,7));
console.log(string1.toUpperCase);
console.log(string1.repeat(4));
console.log(string1.toLocaleUpperCase);
