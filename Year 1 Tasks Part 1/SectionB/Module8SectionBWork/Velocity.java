/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section B Q 19*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
 public class Velocity {
   public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input distance in metres"); 
     double d = sc.nextDouble();
     System.out.println("Input time in seconds"); 
     double t = sc.nextDouble();
     
     double velocity = d/t;
     System.out.println("\nThe velocity is "); 
     System.out.printf("%8.3f",velocity);
     System.out.println("metres per second "); 
    }
}