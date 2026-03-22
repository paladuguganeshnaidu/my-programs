import java.util.Scanner;   
public class Methos{
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1); // Recursive method
    }

    public static void greet() {
        System.out.println("Hi User");
    }

    public static boolean rang(int n) {
        if (n > 3) {
            return true;
        }
        return false;
    }

    public static String createMessage(int n) {
        return "Factiorial is  " + n;
    }

    public static double marks(double n) {
        return n;
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 100);
    }
    public static int even(int n,int m){
        if(n%2==1){
            System.out.println(n);
        }
        return 0;
    }

    public static boolean even(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial:");
        int num = dc.nextInt();
        int result = factorial(num);
        System.out.println(createMessage(result));
        greet();
        System.out.println("Enter a number to check if it's greater than 3:");
        int checkNum = dc.nextInt();
        boolean isGreaterThan3 = rang(checkNum);
        System.out.println("Is the number greater than 3? " + isGreaterThan3);
        System.out.println("Enter marks:");
        double marks = dc.nextDouble();
        System.out.println("Marks entered: " + marks(marks));
        System.out.println("Random number generated: " + getRandomNumber());
        System.out.println("Enter a number to check if it's even:");
        int evenNum = dc.nextInt();
        boolean isEven = even(evenNum);
        System.out.println("Is the number even? " + isEven);
        System.out.println("Enter a number to check if it's even:");
        int evenNum1 = dc.nextInt();
        even(evenNum1,evenNum1);
        dc.close();
    }
}