//create a java program with a vehicle hierarchy including vehicle ,car,sports car classes implements methods for starting & stoping in the base class & specilaized methods for acellrating aadding turbo boost & loading cargo in the sub claases with aproproate method overrides.
public class Vehicle{
    void start(){
        System.out.println("Vehicle has been started");
    }
    void stop(){
        System.out.println("Vehicle has been stopped");
    }
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        Car c=new Car();
        SportsCar s=new SportsCar();
        Truck t=new Truck();
        v.start();
        v.stop();
        c.start();
        c.stop();
        c.accelerate();
        s.start();
        s.stop();
        s.addTurboBoost();
        t.start();
        t.stop();
        t.loadCargo();
    }
}
class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car has been started");
    }
    void accelerate(){
        System.out.println("Car is accelerating");
    }
    @Override
    void stop(){
        System.out.println("Car has been stopped");
    }
}
class SportsCar extends Vehicle{
    @Override
    void start(){
        System.out.println("Sports car has been started");
    }
    void addTurboBoost(){
        System.out.println("Turbo boost has been added");
    }
    @Override
    void stop(){
        System.out.println("Sports car has been stopped");
    }
}
class Truck extends Vehicle{
    @Override
    void start(){
        System.out.println("Truck has been started");
    }
    void loadCargo(){
        System.out.println("Loading cargo");
    }
    @Override
    void stop(){
        System.out.println("Truck has been stopped");
    }
}
