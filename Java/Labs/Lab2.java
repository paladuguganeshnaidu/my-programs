
import java.util.Scanner;
public class Lab2{
    static int sum_even=0,odd_product=1,sum=0;
    static double avg;

    private static boolean isprime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    private static int fibbonacci(int n){
        int f0=0,f1=1,f2=0,count=0;
        int lp=0;
        while(count<n){
            if(count==0){
                f2=0;
            }
            else if(count==1){
                f2=1;
            }
            else{
                f2=f0+f1;
                f0=f1;
                f1=f2;
            }
            count++;
            sum += f2;
            if(f2%2==0){
                sum_even += f2;
            }       
            else{
                odd_product *= f2;
            }
            if(isprime(f2)){
                lp=f2;
            }
        }
        avg=(double)sum/count;
        return lp;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n=sc.nextInt();
        int lp=fibbonacci(n);
        System.out.println("Sum of even terms: "+sum_even);
        System.out.println("Product of odd terms: "+odd_product);
        System.out.println("Largest prime: "+lp);
        System.out.println("Average: "+avg);
        sc.close();
    }
}