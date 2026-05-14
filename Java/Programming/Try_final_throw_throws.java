import java.io.*;
import java.util.Scanner;

public class Try_final_throw_throws {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        try {
            checkAge(a);
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            sc.close();
        } finally {
            System.out.println("Execution finished");
            sc.close();
        }
    }
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Not eligible");
        }
        System.out.println("Eligible");
        
    }
}