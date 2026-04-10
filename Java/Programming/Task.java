interface car {
    void start();
    void accelerate();
    void brake();   
}
interface desiel extends car {
    void move();
    default void display(){
        System.out.println("This is a desiel car");
    }
}
interface sadan extends car {
    void stop();
    void openDoor();
    default void display() {
        System.out.println("This is a sadan car");
    }
    void closeDoor();
}
class Hundai implements sadan { 
    @Override
    public void start() {
        System.out.println("Hundai started");
    }

    @Override
    public void stop() {
        System.out.println("Hundai stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Hundai is accelerating");
    }   

    @Override
    public void brake() {
        System.out.println("Hundai is braking");
    }

    @Override
    public void move() {
        System.out.println("Hundai is moving");
    }

    @Override
    public void openDoor() {
        System.out.println("Hundai door opened");
    }

    @Override
    public void closeDoor() {
        System.out.println("Hundai door closed");
    }
}
public class Task {
    public static void main(String[] args) {
        Hundai hundai = new Hundai();
        hundai.start();
        hundai.move();
        hundai.stop();
        hundai.display();
    }
    
}
