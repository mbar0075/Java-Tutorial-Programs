/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section D Q 2*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
import java.util.concurrent.TimeUnit ;
public class Countdown {
    public static void main (String args[])throws InterruptedException{
     Scanner sc = new Scanner(System.in);
     System.out.println("The Countdown starts");
     //Not needed in task 1//
     
     for(int i= 100; i!=0;i--){
          System.out.println("\f\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t"+i);
         Thread.sleep(1000);
        
        } 
        
       
      System.out.println("It is Midnight Happy new year! ");
           
    }
}