/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section B Q 15*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
 public class BMI {
   public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input weight ");
     double weight = sc.nextDouble();
     System.out.println("Input height ");
     double height = sc.nextDouble();
     double BMI = weight/height;
     
     
     System.out.println("The BMI is  " + BMI + "   kg/m2");
    }
}