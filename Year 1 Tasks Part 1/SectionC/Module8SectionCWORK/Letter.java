/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section c Q 1*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
public class Letter {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input a Letter");
     char letter = sc.next().charAt(0);
     int l = (int)(letter);
     if(!((l>=65)&&(l<97)))
        System.out.println("The letter is a small letter");
     else
        System.out.println("The letter is a capital letter");
        
        
        
    }
}