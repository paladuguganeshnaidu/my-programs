// Java program to demonstrate the state of a thread
class ThreadSimple extends Thread {
    @Override
    public void run() {
        System.out.println("state of thread is:" + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Simple {
    public static void main(String[] args) {
        ThreadSimple t1 = new ThreadSimple();
        System.out.println("State of the thread before starting:" + t1.getState());
        t1.start();
        System.out.println("State of the thread after starting:" + t1.getState());
        try {
            Thread.sleep(2000);
        } catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("State of the thread before join:" + t1.getState());
        try {
            t1.join();
        } catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("State of the thread after join: " + t1.getState());
    }
}