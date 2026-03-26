class  Animal{Animal(){System.out.println("calling parent constructer.....\nparent constructer called:\n     Animal Constructer");}void eat(){System.out.println("calling Parent Method.....\nParent Method called:\n     Animal eats flesh");}}
class Dog extends Animal{Dog(){super.eat();System.out.println("In child class\n     But dog eats bones");}}


public class Super_Usage{public static void main(String[] args){Animal pet1=new Dog();}}



// SUPER (keyword) 
// --super refers to parent class
// --
