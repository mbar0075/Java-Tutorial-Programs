/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section D Q 19*/
// Java program to read data of various types using Scanner class.  
import java.util.*;
public class primeNumbers {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     int j= 0;
     int num = 50;
     boolean check = false;
     for(int i= num ; i!=1;i--){
        check=false; 
         for( j= i-1 ; j!=1;j--){  
         if(i%j==0)
           check = true;
        
        } 
        if(check==false)
        System.out.println(" The number "+ i +" is prime");  
    }  
    }
}