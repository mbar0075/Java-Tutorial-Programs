/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section D Q 10*/
// Java program to read data of various types using Scanner class.  
import java.util.*;
public class Odd{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     int count= 100;
     System.out.println(" The following numbers are odd:  ");
     while(count!=0){
         if((count%2)!=0)
         System.out.println("\t\t\t\t"+count);
         count--;
        }
     
    }
}