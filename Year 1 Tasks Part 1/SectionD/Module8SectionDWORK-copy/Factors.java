/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section D Q 20*/
// Java program to read data of various types using Scanner class.  
import java.util.*;
public class Factors {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     int j= 0;
     int num = 20;

     for(int i= num ; i!=1;i--){
         System.out.println("\nThe number "+ i+" has factors ");
         for( j= i ; j!=1;j--){
           
         if(i%j==0)
          System.out.print(j+" ");  
        } 
          System.out.print("1");  
    }
  }
}