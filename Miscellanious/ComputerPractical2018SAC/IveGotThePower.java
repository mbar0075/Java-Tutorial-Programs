import java.util.*;
public class IveGotThePower{
    public static void main (String args []){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input 2 numbers ");
     System.out.println("Enter the number ");
     int num1 = sc.nextInt();
     System.out.println("Enter the power ");
     int num2 = sc.nextInt();
     double ans = 0;
     for (int i = num2; i!=0;i--){
     ans = num1*num1;
    }
    System.out.println("The number"+ num1 +" to the power of "+num2 + " is "+ ans);
  }
   }        
   