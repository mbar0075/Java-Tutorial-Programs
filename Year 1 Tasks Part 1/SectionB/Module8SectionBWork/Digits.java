/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section B Q 6*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
 public class Digits {
   public static void main (String args[]){
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Input a number  between 0 and 1000"); 
      int n = sc.nextInt();
      int total =(n/1000)+((n%1000)/100)+ ((n%100)/10) +(n%10); 
      
        
      System.out.println("The digits of n  add up to  " + total);  
        
    }
}