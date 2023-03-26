
import java.util.*;
public class Exception1b  {
   
 public static void main (String args [])  {
     Scanner sc = new Scanner(System.in);
    try { 
     System.out.println("Enter number ");
	    int d = sc.nextInt();
	    int a = 34/d;
	  }
	 catch (ArithmeticException ae ) 
	  {
	      System.out.println("division by zero ");
	   }
	catch (InputMismatchException e ) {
	            System.out.println("Letter entered instead of a number");
	           } 
	           
	 finally {
	       System.out.println("This is always executed");
	   }
}
}
