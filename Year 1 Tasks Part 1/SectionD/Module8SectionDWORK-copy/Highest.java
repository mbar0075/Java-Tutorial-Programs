/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section D Q 5*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
public class Highest {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input how many answers you want to add");
      int count= sc.nextInt(); 
      double total = 0;
      double num= 0;
      double max= Double.MIN_VALUE;
     for(int i= 0 ; i<count;i++){
         System.out.println("Input num "+(i+1));
         num= sc.nextDouble(); 
         total+=num;
         if(max<num)
            max=num;
        } 
      System.out.println("The highest number is "+ max); 
      System.out.println("The answer is " + total);
           
    }
}