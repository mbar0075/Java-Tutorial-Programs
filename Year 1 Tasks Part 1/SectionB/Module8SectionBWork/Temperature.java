/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section B Q 11*/
// Java program to read data of various types using Scanner class. 
import java.util.*;
public class Temperature {
   public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Input temperature in Fahrenheit ");
    double temp = sc.nextDouble();
    double t= (temp-32)*5/9;
    
    
    
    
    System.out.println("The temperature in Celsius is " + t );
  }
}