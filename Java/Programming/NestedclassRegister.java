import java.util.*;
import java.util.Scanner;
import java.io.*;
class Register_Student {
    int StudentId;
    String StudentName;
    Passowrd_set password;
    
    Register_Student(String name){
        this.StudentId = 0; // Initialize with a default value
        this.StudentName = name;
    }
    public class Passowrd_set {
        String Student_login_pass;
        Passowrd_set(String pass){
            this.Student_login_pass = pass;
        }
        @Override
        public String toString() {
            return "Password: " + Student_login_pass;
    }
    }
    void display(){
        System.out.println("Student ID: " + StudentId);
        System.out.println("Student Name: " + StudentName);
        System.out.println(password);
    }
}
public class NestedclassRegister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student email:");
        String email = sc.nextLine().trim();
        Register_Student s1 = new Register_Student(email);
        System.out.println(s1.StudentName +"\nEnter the password to be set:");
        String passwordInput = sc.nextLine();
        s1.password = s1.new Passowrd_set(passwordInput);
        s1.display();
        try (FileWriter fw = new FileWriter("student_details.json", true);
            BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Student Name: " + s1.StudentName + "\n");
            bw.write("Student Login Password: " + s1.password.Student_login_pass + "\n");
            bw.write("---\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        sc.close();
    }
}