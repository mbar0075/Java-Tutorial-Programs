/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section D Q 8*/
// Java program to read data of various types using Scanner class.  
import java.util.*;
public class rangemarks {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     double mark = -1;
        while((mark<0)||(mark>100)){
         System.out.println("Input a mark between 0 and 100 ");
         mark = sc.nextDouble();
         if((mark<0)||(mark>100))
            System.out.println("Error . The mark is invalid ");
        }
     System.out.println("You entered a valid mark ");       
    }
}