import java.util.Scanner;
public class palimdrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        StringBuffer sb=new StringBuffer(input);
        if(input.equals(sb.reverse().toString())){
            System.out.println("The string is a palindrome.");
        }
        else{
            System.out.println("The string is not a palindrome.");
        }
        scanner.close();
    }
}