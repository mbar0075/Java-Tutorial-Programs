import java.util.*;
public class Absolute{
    public static void main (String args []){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Number bruh");
     double num = sc.nextDouble();
     if (num>0)
        System.out.println("The absolute value of the number is "+num);
     else if (num<0)
        System.out.println("The absolute value of the number is "+(num*-1));   
     else
        System.out.println("Invalid");     
         }        
   }
