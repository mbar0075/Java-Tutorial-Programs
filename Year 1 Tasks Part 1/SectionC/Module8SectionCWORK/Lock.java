/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section c Q 5*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
public class Lock{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     
     int l1 = 27;
     int l2 = 18;
     int l3 = 54;
     
     System.out.println("Turn the Dial to the first number(num1)");
     int num1  = sc.nextInt();
     System.out.println("Turn the Dial to the second number(num2)");
     int num2  = sc.nextInt();
     System.out.println("Turn the Dial to the third number(num3)");
     int num3  = sc.nextInt();
     
     if((num1==l1)&&(num2==l2)&&(num3==l3))
        System.out.println("The lock opens !");
     else
        System.out.println("Failed to open lock !");
        
    }
}