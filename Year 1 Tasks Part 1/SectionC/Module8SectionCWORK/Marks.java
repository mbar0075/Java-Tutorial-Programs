/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section c Q 2*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
public class Marks {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input mark 1");
     double m1 = sc.nextDouble();
     System.out.println("Input mark 2");
     double m2 = sc.nextDouble();
     System.out.println("Input mark 3");
     double m3 = sc.nextDouble();
     
     if((m1>=50)&&(m2>=50)&&(m3>=50))
        System.out.println("Passed");
     else
        System.out.println("Failed");
        
        
        
    }
}