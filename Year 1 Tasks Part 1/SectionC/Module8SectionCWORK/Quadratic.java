/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section c Q 8*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
public class Quadratic{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input num1");
     double num1 = sc.nextDouble();
     System.out.println("Input num2");
     double num2 = sc.nextDouble();
     System.out.println("Input num3");
     double num3 = sc.nextDouble();
     double total1 = ((-num2)+Math.sqrt(Math.pow(num2,2)+(-4*num1*num3)))/(2*num1);
     double total2 = ((-num2)-Math.sqrt(Math.pow(num2,2)+(-4*num1*num3)))/(2*num1);
     
     
     if((total1!=0)&&(total2!=0))
        System.out.println(" The equation has 2 roots");
     else if((total1!=0)||(total2!=0))
        System.out.println(" The equation has 1 root");
     else
        System.out.println("The program doesn't have any roots");
        
     System.out.println("These are the roots " + total1 +"  "+ total2);
     
  }
}