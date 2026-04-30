public class Exeception {
    public static void main(String[] args) {
        try{
            //first try block
            try{
                //seocnd try block
                try{
                    //third try bloack
                    int a=10/0;
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Array index is out of bounds");
                }
            }
            catch(StringIndexOutOfBoundsException e){
                System.out.println("String index is out of bounds");
            }
        }
        catch(ArithmeticException e){
           System.out.println("Arithmetic Exception Occured"); 
        }
        catch(Exception e){
            System.out.println("Exception occured");
        }
    }
}
