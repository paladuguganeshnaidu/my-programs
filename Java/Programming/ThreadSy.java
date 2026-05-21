class counter{
    int count;
    void increment(){
        System.out.println(Thread.currentThread().getName()+" count: "+count);
        count++;
    }
}
class MyThread extends Thread{
    counter c;
    MyThread(counter c){
        this.c=c;
    }
    public void run(){
        for(int i=0;i<5;i++){
            c.increment();
        }
    }
}
public class ThreadSy {
    public static void main(String[] args) {
        counter c = new counter();
        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);
        t1.start();
        t2.start();
    }
}
//a person is building a movie ticket booking system where multiple threads trying to to book tickets at the same hall ,
//  how do you ensure that same seats are not booked by multiple people at the same time ?