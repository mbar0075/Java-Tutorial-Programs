/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section B Q 10*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
 public class Density {
   public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Input mass");
    int mass = sc.nextInt();
      
    System.out.println("Input volume");
    int volume = sc.nextInt(); 
    double density = mass/volume;
       
    System.out.println("The density is " + density);   
    }
}