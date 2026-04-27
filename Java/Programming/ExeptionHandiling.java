import java.util.Scanner;

public class ExeptionHandiling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Single try with multiple catch blocks demo");
		System.out.println("Choose a case:");
		System.out.println("1 -> ArithmeticException (divide by zero)");
		System.out.println("2 -> NumberFormatException (invalid number parse)");
		System.out.println("3 -> ArrayIndexOutOfBoundsException");
		System.out.println("4 -> Normal execution");

		int choice = sc.nextInt();

		try {
			if (choice == 1) {
				int a = 10;
				int b = 0;
				System.out.println("Result: " + (a / b));
			} else if (choice == 2) {
				String value = "abc";
				int num = Integer.parseInt(value);
				System.out.println("Parsed number: " + num);
			} else if (choice == 3) {
				int[] arr = {1, 2, 3};
				System.out.println("Element: " + arr[5]);
			} else {
				System.out.println("No exception. Program executed normally.");
			}
		} catch (ArithmeticException e) {
			System.out.println("Caught ArithmeticException: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Caught NumberFormatException: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		} finally {
			System.out.println("Finally block executed.");
			sc.close();
		}
	}
}
