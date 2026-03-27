class Ro{
    final int a=10;
    void display(){
        //a=20; // This will cause a compile-time error because 'a' is final and cannot be reassigned
        System.out.println(a);
    }
}
public class Final {
    public static void main(String[] args) {
        Ro obj = new Ro();
        obj.display();
    }
}
