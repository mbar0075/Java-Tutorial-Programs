/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section B Q 18*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
 public class Age {
   public static void main (String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Input current age ");
      int age = sc.nextInt();
      
      System.out.println("Last year you were  " + (--age)+ "  years old");
      
    }
}