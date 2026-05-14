import java.util.Scanner;
public class ExeceptionChoper {
    public static void wegi(int w) throws Error {
        if(w>60){
            int a=w-60;
            throw new Error("\nHeavy Load....\nDrop down "+a+"kgs to Start the Fan's");
        }else{
        System.out.println("Chopper Engine Started.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        try {
            wegi(w);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }    
}