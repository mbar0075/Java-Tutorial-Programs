/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section D Q 13*/
// Java program to read data of various types using Scanner class.  
import java.util.*;
public class oddNumbers{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     int choice = 0;
     int count = 0;
     int total = 0;
     System.out.println("Input 20 whole numbers");
     do{
        System.out.println("Input number");
         choice  = sc.nextInt(); 
         if((choice%2)==1)
          total++;
          count++;
        }while(count<20);
     System.out.println("There were  "+ total +" odd numbers"); 
     
    }
}