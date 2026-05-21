/* Design a java program to demonstrate the string handling including creating strings ,
using string constructs and literals concatenating strings,
extracting characters at the specified index & comparing strings for equality.
*/
import java.util.Scanner;*;
public class Lab10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = "Hello";
        String str2 = new String("World");
        String str3 = str1 + " " + str2;
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Concatenated: " + str3);
        int index = scanner.nextInt();
        System.out.println("Character at index " + index + " in String 1: " + str1.charAt(index));
        System.out.println("String 1 equals String 2: " + str1.equals(str2));
    }
}
