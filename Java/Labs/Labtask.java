/*Write a java program to create two thread to demonstrate concept of multithreading
where thread1 should print number form 1 to 10 where thread2 should print alphabets from A to Z */
class Thread1 extends Thread{
    synchronized
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}
class Thread2 extends Thread{
    synchronized
    public void run(){
        for(char c='A';c<='Z';c++){
            System.out.println(c);
        }
    }
}
public class Labtask{
    public static void main(String[] args){
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();
    }
}