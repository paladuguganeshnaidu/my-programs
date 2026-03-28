import java.io.*;
import java.util.Scanner;
public class NestedclassLogin {
    public static void main(String[] args) {
        LoginSystem login = new LoginSystem();
        login.displayLoginMenu();
    }
    static class LoginSystem {
        private static final String FILE_PATH = "student_details.txt";   
        public void displayLoginMenu() {
            Scanner scanner = new Scanner(System.in);
            boolean loggedIn = false;
            System.out.println("===== Student Login System =====");
            while (!loggedIn) {
                System.out.print("Enter Email: ");
                String email = scanner.nextLine().trim();
                System.out.print("Enter Password: ");
                String password = scanner.nextLine().trim();
                if (validateCredentials(email, password)) {
                    System.out.println("\n✓ Login Successful!");
                    loggedIn = true;
                } else {
                    System.out.println("✗ Invalid credentials. Try again.\n");
                }
            }
            scanner.close();
        }
        private boolean validateCredentials(String email, String password) {
            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] details = line.split(",");
                    if (details.length >= 3 && details[1].trim().equals(email) 
                            && details[2].trim().equals(password)) {
                        return true;
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error: student_details.txt not found!");
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
            return false;
        }
    }
}