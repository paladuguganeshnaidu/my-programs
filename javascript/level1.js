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