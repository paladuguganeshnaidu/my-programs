
//develop a java program that handles exceptions for divison by 0 and invalid input.Use try catch vlog to catch arthematic exception for divison by 0 and number format exception for invalid input for non integer input & provide user friendly message.
import java.util.*;

public class Lab8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value of a: ");
            int a = sc.nextInt();
            System.out.println("Enter the value of b: ");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input");
        }
        sc.close();
    }
}
