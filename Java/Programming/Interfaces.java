interface Animal {
    void eat();
    void sleep();
}
interface Vehicle {
    void drive();
    void refuel();
}

class Car implements Animal, Vehicle {
    @Override
    public void eat() {
        System.out.println("Car doesn't eat");
    }
    @Override
    public void sleep() {
        System.out.println("Car doesn't sleep");
    }
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
    @Override
    public void refuel() {
        System.out.println("Car is refueling");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Car car = new Car();
        car.eat();
        car.sleep();
        car.drive();
        car.refuel();
    }
}           