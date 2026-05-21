/*
develop a java program that implements three threads.
the first thread generates random numbers.
*/
/*WR A JAVA pro that implements multi thread application that has three threads 
first  thread generates the random integer upto 10 secs;
2nd threaud calcultes square of a number and third thread calculates cube of a number;
*/
import java.util.*;

class Square extends Thread{
    public int number;
    public Square(int number){
        this.number=number;
    }
    public void run(){
        System.out.println("The square of: " +number+ " -> " +number*number);
    }
}
class Cube extends Thread{
    public int number;
    public Cube(int number){
        this.number=number;
    }
    public void run(){
        System.out.println("The cube of: " +number+ " -> " +number*number*number);
    }
}
class RandomNum extends Thread
{
    public void run(){
        Random r = new Random();
        for(int i=0;i<=9;i++){
            int num = r.nextInt(100);
            Square t1 = new Square(num);
            Cube t2 = new Cube(num);
            t1.start();
            t2.start();
        }
    }
}
public class Lab9
{
    public static void main(String[] args)
    {
        RandomNum t = new RandomNum();
        t.start();
    }
}
