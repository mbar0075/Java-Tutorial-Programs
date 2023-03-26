import java.util.*;
public class Binary
{
    
    public static String Binary( int n){
        if ( n==0)
            return "0";
        else
            return Binary(n/2)+(n%2);
    }
    
    
    public static void main (String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Input number to convert to binary");
      int num = sc.nextInt();
      System.out.println(num +"  in binary is  "+Binary(num));
    }
}
