/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section B Q 12*/
// Java program to read data of various types using Scanner class.
import java.util.*;
public class Circle {
   public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    final double PI = 3.142;
    System.out.println("Input radius");
    double r = sc.nextDouble();
    double per = 2* PI *r;
    double area = PI*r*r;
    
    System.out.println("The area is  " + area + " cm squared and hte perimeter is " + per + " cm ");    
   }
}