import java.util.*;
import java.util.Scanner;
import java.io.*;
class Register_Student {
    int StudentId;
    String StudentName;
    Passowrd_set password;
    
    Register_Student(int id, String name){
        this.StudentId = id;
        this.StudentName = name;
    }
    public class Passowrd_set {
        String Student_login_pass;
        Passowrd_set(String pass){
            this.Student_login_pass = pass;
        }
    }
    void display(){
        System.out.println("Student ID: " + StudentId);
        System.out.println("Student Name: " + StudentName);
        System.out.println("Student Login Password: " + password.Student_login_pass);
    }
}
public class Nestedclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Register_Student s1 = new Register_Student(1, "John Doe");
        System.out.println(s1.StudentName +" Enter the password to be set:");
        String passwordInput = sc.nextLine();
        s1.password = s1.new Passowrd_set(passwordInput);
        s1.display();
        try (FileWriter fw = new FileWriter("student_details.txt", true);
            BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Student ID: " + s1.StudentId + "\n");
            bw.write("Student Name: " + s1.StudentName + "\n");
            bw.write("Student Login Password: " + s1.password.Student_login_pass + "\n");
            bw.write("---\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        sc.close();
    }
}