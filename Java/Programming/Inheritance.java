
class Vechicle{
    void run(){
        System.out.println("Vechicle is running");
    }
    void toi(){
        System.out.println("this is in vechicle class");
    }
}
class Bike extends Vechicle{
    @Override
    void run(){
        System.out.println("Bike is running");
    }
    void test(){
        System.out.println("this is in bike class");
    }

}
class bmw extends Bike{
@Override
    void run(){
        System.out.println("1.This is bmw bike.\n     It is very expensive.\n     It is very fast.");
    }
    void bmweew(){
        System.out.println("2. This is bmw bike.\n     It is very expensive.\n     It is very fast.");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        bmw b=new bmw();
        b.run();
        b.test();
        Bike b1=new Bike();
        b1.run();
        b1.test();
        Vechicle v=new Vechicle();
        v.run();
        b.bmweew();
    }
}