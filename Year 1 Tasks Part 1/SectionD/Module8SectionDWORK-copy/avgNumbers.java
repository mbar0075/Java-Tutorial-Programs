/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section D Q 12*/
// Java program to read data of various types using Scanner class.  
import java.util.*;
public class avgNumbers{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     double avg= 0;
     double choice = 0;
     double count = -1;
     double total = 0;
     System.out.println("Input numbers to calculate average press 0 to quit");
     do{
        System.out.println("Input number");
         choice  = sc.nextDouble(); 
         count++;
         total+=choice;
        }while(choice!=0);
     avg=total/count;
     System.out.println("The average is "+ avg); 
     
    }
}