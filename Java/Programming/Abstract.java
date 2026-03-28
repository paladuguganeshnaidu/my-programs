
abstract class Animal {
    abstract void mk();
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}
class Dog extends Animal {
    @Override
    void mk() {
        System.out.println("Woof! Woof!");
    }
}
class Cat extends Animal {
    @Override
    void mk() {
        System.out.println("Meow! Meow!");
    }
}
public class Abstract {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // Error! Cannot instantiate abstract class
        Dog dog = new Dog();
        dog.mk();
        dog.sleep();
        Cat cat = new Cat();
        cat.mk();
        cat.sleep();
    }
}