import java.util.*;
public class Exception1c  {

    public static void main (String args [])  {

        boolean repeat = false;
        do{
            Scanner sc = new Scanner(System.in);
            repeat = false;

            try { 
                System.out.println("Enter number ");
                int d = sc.nextInt();
                int a = 34/d;
            }
            catch (ArithmeticException ae ) 
            {
                System.out.println("division by zero ");
                repeat = true;
            }
            catch (InputMismatchException e ) {
                System.out.println("Please input an integer");
                repeat = true;

            }  
        } while(repeat == true);
    }
}
