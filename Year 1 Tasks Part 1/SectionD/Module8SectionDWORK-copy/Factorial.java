/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section D Q 17*/
// Java program to read data of various types using Scanner class.  
import java.util.*;
public class Factorial {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     int num = 10;
     int factorial = 1; 
     int j= 0;
        for(int i= 10 ; i!=0;i--){// to work out the factorial
         factorial = 1;   
         for( j= i ; j!=0;j--){//going through all the numbers
         factorial *=j;
        } 
        System.out.println("The Factorial of "+ i +" is "+ factorial);
      }   
    }
}