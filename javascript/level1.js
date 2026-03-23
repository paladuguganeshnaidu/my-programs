//const is used to declare a constant variable, which cannot be reassigned after its initial assignment.
const birthYear = 2007;
console.log("I was born in " + birthYear);

//let is used to declare a variable that can be reassigned later in the code.
let age;
age = 26;
console.log("Age: " + age);

//void is a special data type that represents the absence of a value. It is often used to indicate that a function does not return any value.
function greet() {
    console.log("Hello!");
}
greet();

{
  let blockScoped = "inside";
  var functionScoped = "inside too";
}

console.log(functionScoped);

console.log(myVar);
var myVar = 10;

//Mini Challenge
//Write a simple program that:
//Declares a const for your name.
//Declares a let for your age.
//Increases the age by 1
//Prints both values.
//Example output:
//My name is Alex and I am 26 years old.

const name="Ganesh";
let age_me=19;
age_me=age_me+1;
console.log("My name is " +name+" and I am "+age_me+" years old");
console.log("__________________________________________________________________________________________________________________________________________________________________")
console.log("Day 2 of JavaScript learning!");
console.log("___________________________________________________________________________________________________________________________________________________________________")

//Datatypes
//String: A sequence of characters enclosed in single or double quotes. Example: "Hello, World!"
//Number: Represents both integer and floating-point numbers. Example: 42, 3.14
//Boolean: Represents a logical value that can be either true or false. Example: true, false
//Null: Represents the intentional absence of any object value. Example: null
//Undefined: Represents a variable that has been declared but has not been assigned a value. Example: undefined

let age1 = 25;          // integer
let price = 19.99;     // decimal
let negative = -10;
let bigNum = 1e6;      // 1,000,000
let namem="Ganesh";
let isStudent = true; // boolean
let emptyValue = null;
let undefinedValue;
let bigIntNum = 1234567890123456789012345678901234567890n; // BigInt
console.log("typeof age1 (" + age1 + "): " + typeof age1); // "number"
console.log("typeof price (" + price + "): " + typeof price); // "number"
console.log("typeof negative (" + negative + "): " + typeof negative); // "number"
console.log("typeof bigNum 1e1-short(" + bigNum + "): " + typeof bigNum); // "number"
console.log("typeof namem (" + namem + "): " + typeof namem); // "string"
console.log("typeof isStudent (" + isStudent + "): " + typeof isStudent); // "boolean"
console.log("typeof emptyValue (" + emptyValue + "): " + typeof emptyValue); // "object" (this is a quirk in JavaScript, null is considered an object)
console.log("typeof undefinedValue (" + undefinedValue + "): " + typeof undefinedValue); // "undefined"
console.log("typeof bigIntNum (" + bigIntNum + "): " + typeof bigIntNum); // "bigint"


//Arithmetic Operators
let a = 10;
let b = 5;
console.log("a + b: " + (a + b)); // Addition
console.log("a - b: " + (a - b)); // Subtraction
console.log("Multiplication: " + a * b); // Multiplication
console.log("Division: "+a/b); // Division
console.log("Reminder: "+a%b); // Modulus
console.log("Exponentiation: "+a**b); // Exponentiation

//Assignment Operators
let c = 10;
c += 5; // c = c + 5
console.log("c after += 5: " + c); // 15
c -= 3; // c = c - 3
console.log("c after -= 3: " + c); // 12
c *= 2; // C=C*2
console.log("c after *= 2: " + c); // 24
c/=4; //c=c/4
console.log("c after /= 4: " + c); // 6
c%=5; //c=c%5
console.log("c after %= 5: " + c); // 1
c**=3; //c=c**3
console.log("c after **= 3: " + c); // 1

//Comparison Operators
let x = 10;
let y = 5;
console.log("x<y: " + (x < y)); // Less than
console.log("x > y: " + (x > y)); // Greater than
console.log("x==y: " + (x == y)); // Equality (loose)
console.log("x!=y: " + (x != y)); // Inequality (loose)
console.log("x===y: "+(x===y)); // Strict equality
console.log("x!==y: " + (x !== y)); // Strict inequality
console.log("x<=y: " + (x <= y)); // Less than or equal to
console.log("x>=y: " + (x >= y)); // Greater than or equal to

//Logical Operators
let p = true;
let q = false;
console.log("p && q: " + (p && q)); // Logical AND
console.log("p || q: " + (p || q)); // Logical OR
console.log("!p: " + !p); // Logical NOT

//Ternary (Conditional) Operator
let age2 = 18;
let canVote = age2 >= 18 ? "Yes, you can vote!" : "No, you cannot vote.";
console.log(canVote);


//Conditional Statements – Making Decisions
if (age >= 18) {
  console.log("You can vote.");
}

//if ...else statement
let password="Ganesh4763";
if(password=="Ganesh4763"){
    console.log("Authentication successful.");
} else {
    console.log("Authentication failed.");
}

//multi-branch if...else statement
if(password.length < 8){
    console.log("Password is too short.");
} else if(password.length > 20){
    console.log("Password is too long.");
} else {
    console.log("Password length is acceptable.");
    if(password.includes("123")){
        console.log("But,");
        console.log("Password should not contain '123'.");
    } else if(password.toLowerCase().includes("password")){
        console.log("Password should not contain 'password'.");
    }
}

//switch statement
let day="Tue";
switch(day){
  case "Mon":
    console.log("Blue");
    break;
  case "Tue":
    console.log("Red");
    break;
  case "Wed":
    console.log("Green");
    break;
  case "Thu":
    console.log("Yellow");
    break;
  case "Fri":
    console.log("Purple");
    break;
  case "Sat":
    console.log("Orange");
    break;
  case "Sun":
    console.log("Pink");
    break;
  default:
    console.log("Invalid day");
}


//Loops – Repeating Actions
//for loop
for(let i=1; i<=5; i++){
    process.stdout.write(i + " ");
}
console.log(); // for new line


//while loop
let count=0;
while(count<=5){
    process.stdout.write(count + " ");
    count++;
}
console.log(); // for new line

//do...while loop
let num=0;
do{
    process.stdout.write(num + " ");
    num++;
} while(num<=5);
console.log(); // for new line


//Function – Reusable Blocks of Code
function greet(name){
    return "Hello, " + name + "!";
}
console.log(greet("Ganesh"));

//return values
function add(num1,num2){
  return num1+num2;
}
console.log("Sum: " + add(5, 10));
//after return statement, the function exits and any code below it will not be executed.

//Parameters vs Arguments
// Parameters are the variables defined in the function declaration
// Arguments are the values passed to the function when it is called

//Function Expression
const sq=function(x){
    return x*x;
}
console.log("Square of 5: " + sq(5));

//Arrow Functions (ES6)
//this is also called as short hand function
const cA=(x)=> x*x*x;
console.log("Cube of 5: " + cA(5));

//Default Parameters
function stu(name,college="Ncet"){
    return "Name: "+name+" College: "+college;
}
console.log(stu("Ganesh"));

//in js if you provide an argument for a parameter that has a default value, the provided argument will override the default value.
//If you do not provide an argument, the function will use the default value for that parameter.
console.log(stu("Alice", "IIT"));

//Scope Inside Functions
function myFunction() {
  let secret = 42;
  console.log(secret); // works
}
myFunction();
//console.log(secret); // ReferenceError: secret is not defined

