import java.util.Scanner;
public class Lab1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        char op;
        String history="";
        boolean continueop=true;
        while (continueop){
            System.out.println("Enter first number:");
            num1=sc.nextInt();
            System.out.println("Enter second number:");
            num2=sc.nextInt();
            System.out.println("Enter operator:");
            op=sc.next().charAt(0);
            if (num1>=0 && num2>0){
                double result;
                switch (op) {
                    case '+':
                        result =num1+num2;
                        System.out.println(" "+num1+" "+op+" "+num2+"="+result);
                        history+=" "+num1+" "+op+" "+num2+"="+result+"\n"; 
                        break;
                    case '-':
                        result =num1-num2;
                        System.out.println(" "+num1+" "+op+" "+num2+"="+result);
                        history+=" "+num1+" "+op+" "+num2+"="+result+"\n"; 
                        break;    
                    case '*':
                        result =num1*num2;
                        System.out.println(" "+num1+" "+op+" "+num2+"="+result);
                        history+=" "+num1+" "+op+" "+num2+"="+result+"\n"; 
                        break; 
                    case '/':
                        result =(double)num1/num2;
                        System.out.println(" "+num1+" "+op+" "+num2+"="+result);
                        history+=" "+num1+" "+op+" "+num2+"="+result+"\n"; 
                        break;  
                    default:
                        System.out.println("invalid oprator");
                        break;
                       
                }
                System.out.println("do yo want you continue?(yes/no)"); 
                String input=sc.next();
                if(input.equalsIgnoreCase("no")){
                    continueop=false;
                }

                
            }
            else{
                System.out.println("Enter postive numbers only.");
                continue;
            }
        }
        System.out.println("do you want history?(yes/no).");
        String input=sc.next();
        if(input.equalsIgnoreCase("yes")){
            System.out.println("History as follows:");
            System.out.println(history);
        }
        sc.close();
    }
}