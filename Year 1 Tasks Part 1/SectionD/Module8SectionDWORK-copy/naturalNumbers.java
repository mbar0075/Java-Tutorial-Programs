/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section D Q 6*/
// Java program to read data of various types using Scanner class.  
import java.util.*;
public class naturalNumbers {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input number ");
     int num = sc.nextInt();
     int sum = 0;
   
        for(int i= 1 ; i<=num;i++){
            sum+=i;
        } 
         
     System.out.println("The total of the natural numbers of "+num+" is "+sum);
    }
}