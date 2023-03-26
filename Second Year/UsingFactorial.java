import java.util.*;
public class UsingFactorial
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        
        Factorial f = new Factorial();
        System.out.println("Input number");
        int n = sc.nextInt();
        f.setNumber(n);
        
        System.out.println("The Factorial of  "+n+"  is  "+f.calcFactorial());
    }
}
