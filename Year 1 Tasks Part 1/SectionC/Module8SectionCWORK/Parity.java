/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section c Q 4*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
public class Parity {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input a whole number");
     int num  = sc.nextInt();
     if((num%2)==0)
        System.out.println("The number is even");
     else
        System.out.println("The number is odd");
    }
}