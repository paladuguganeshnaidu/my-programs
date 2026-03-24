const user = {
  name: "Ganesh",
  age: 20
};

console.log(user.name); // Output: Ganesh
console.log(user.age); // Output: 20

user.age+=1;

console.log(user.age); // Output: 21

user.city="Banglore";
console.log(user.city); // Output: Banglore

console.log(user); // Output: { name: 'Ganesh', age: 21, city: 'Banglore' }

//---------------------------------------------------------------------------------------------------

//creating an object using constructor function
function User(name, age) {
  return {name,age};
}
const user1 = new User("Ganesh", 20);
const user2 = new User("Alice", 25);
console.log(user1); // Output: { name: 'Ganesh', age: 20 }
console.log(user2); // Output: { name: 'Alice', age: 25 }
const user3 = new User("Bob", 30);