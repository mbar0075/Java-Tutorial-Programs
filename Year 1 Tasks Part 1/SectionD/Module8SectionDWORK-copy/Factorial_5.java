/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section D Q 3*/
// Java program to read data of various types using Scanner class.  
import java.util.*;
public class Factorial_5 {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input number ");
     int num = sc.nextInt();
     int factorial = 1;
   
     for(int i= 1 ; i<=num;i++){
         factorial *=i ;
        } 
         
     System.out.println("The Factorial of "+ num +" is "+ factorial);
    }
}