/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section c Q 6*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
public class Largest{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input num1");
     int num1 = sc.nextInt();
     System.out.println("Input num2");
     int num2 = sc.nextInt();
     System.out.println("Input num3");
     int num3 = sc.nextInt();
     int max = 0;
     
     if (num1>max)
        max=num1;
     if(num2>max)
        max=num2;
     if(num3>max)
        max=num3;
        
     System.out.println("The largest number was " + max);  
        
    }
}