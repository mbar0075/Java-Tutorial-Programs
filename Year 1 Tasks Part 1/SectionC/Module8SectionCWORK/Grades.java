/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section c Q 3*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
public class Grades {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input a mark for a music theory exam");
     double mark = sc.nextDouble();
     
    
     if(mark<66)
        System.out.println("Failed");
     else if((mark>=66)&&(mark<=80))
        System.out.println("Passed");
        
     if((mark>=80)||(mark<90))
        System.out.println("Merit");   
     else if(mark>=90)
        System.out.println("Disctinction");   
        
        
    }
}