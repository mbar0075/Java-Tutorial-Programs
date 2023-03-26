import java.util.*;
public class Triangle{
    public static void main (String args []){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input 3 angles of a triangle\n");
     System.out.println("Enter angle1 ");
     double num1 = sc.nextDouble();
     System.out.println("Enter angle2 ");
     double num2 = sc.nextDouble();
     System.out.println("Enter angle3 ");
     double num3 = sc.nextDouble();
     
     double check = num1+num2+num3;
     if(check==180)
     System.out.println("The triangle is valid");
     else
     System.out.println("The triangle is invalid");
    }
   }        
   