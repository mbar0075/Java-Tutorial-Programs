import java.util.*;
public class Factorial
{
    public static int Factorial( int n){
        if ( n==0)
            return 1;
        else
            return n*Factorial(--n);
    }
    
    public static String Factorial2( int n){
        if ( n==1)
            return "1";
        else
            return n+"*"+Factorial2(--n);
    }
    
    public static void main (String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Input number");
      int num = sc.nextInt();
      System.out.println("The factorial of "+num+"!  is "+Factorial2(num)+" = "+Factorial(num));
    }
}
