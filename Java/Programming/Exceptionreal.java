import java.util.Scanner;

public class Exceptionreal {
    static String[] Refridge = {"cheese", "pepperoni", "chicken", "onions"};
    static String[] Chiken_required = {"chicken", "paneer", "onions"};
    static String[] Paneer_required = {"paneer", "cheese", "onions"};
    static String[] Cheese_required = {"cheese", "paneer", "onions"};
    static String[] Pepperoni_required = {"pepperoni", "cheese", "onions"};
    public static boolean IsAvail(String CustPizza) {
        String[] requirements;
        if (CustPizza.contains("chicken")) {
            requirements = Chiken_required;
        } else if (CustPizza.contains("paneer")) {
            requirements = Paneer_required;
        } else if (CustPizza.contains("cheese")) {
            requirements = Cheese_required;
        } else if (CustPizza.contains("pepperoni")) {
            requirements = Pepperoni_required;
        } else {
            System.out.println("Error: Pizza not listed in Menu.");
            return false; 
        }
        boolean available = true;
        for (int i = 0; i < requirements.length; i++) {
            boolean found = false;
            for (int j = 0; j < Refridge.length; j++) {
                if (requirements[i].equalsIgnoreCase(Refridge[j])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(requirements[i] + " is stocked out. Sorry!");
                available = false;
            }
        }
        return available; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("_____________________________________");
            System.out.println("          Pizza Palace - Menu        ");
            System.out.println("_____________________________________");
            System.out.println("        Paneer  Pizza     $12       ");
            System.out.println("        Chicken Pizza     $15       ");
            System.out.println("        Cheese  Pizza     $10       ");
            System.out.println("        Onions  Pizza     $8        ");
            System.out.println("_____________________________________");
            
            System.out.println("Enter your order: ");
            String CustPizza = sc.nextLine().toLowerCase();
            
            boolean available = IsAvail(CustPizza);
            
            if (!available) {
                throw new Exception("Order Cancelled.");
            } else {
                System.out.println("Order Accepted.\n5 mins for delivery");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        } finally {
            System.out.println("Thank you for visiting Pizza Palace!");
            sc.close();
        }
    }
}