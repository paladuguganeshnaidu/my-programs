public class StringC {
    public static void main(String[] args) {
        String str1="Hello, World!";
        str1=str1+" Welcome to Java programming.";
        StringBuffer str2=new StringBuffer("Hi, Ganesh!");
        str2.append(" Welcome to Java programming.");
        
        System.out.println(str1);
        System.out.println("Printing Str2 using StringBuffer:");
        System.out.println(str2);
        str2.delete(0, 3);
        System.out.println("After deleting first 3 characters from str2:");
        System.out.println(str2);
        str2.append(" How are you?");
        System.out.println("After appending to str2:");
        System.out.println(str2);
        str2.reverse();
        System.out.println("After reversing str2:");
        System.out.println(str2);
    }
}
/* Output:
Hello, World! Welcome to Java programming.
Printing Str2 using StringBuffer:
Hi, Ganesh! Welcome to Java programming.
After deleting first 3 characters from str2:
i, Ganesh! Welcome to Java programming.
After appending to str2:
i, Ganesh! Welcome to Java programming. How are you?
After reversing str2:
?uoy erA woh  gninraM sihT
*/