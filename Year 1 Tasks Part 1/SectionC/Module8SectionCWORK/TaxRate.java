/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section c Q 13*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
public class TaxRate{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input status married (M) and single (S) to find the tax to be paid");
     char s = sc.next().charAt(0);
     System.out.println("Input income");
     int i  = sc.nextInt();
     double tax = 0;
     if((s==('S'))||(s==('s'))){
         System.out.println("You are " + s);
         if((i>=0)&&(i<=8500))
            tax=0;
         else if((i>=8501)&&(i<=14500))
            tax=i*0.15;
         else if((i>=14501)&&(i<=60000))
            tax=i*0.25;
         else if(i>=60001)
            tax=i*0.35;
      }  
     else if((s==('M'))||(s==('m'))){
         System.out.println("You are " + s);
         if((i>=0)&&(i<=11900))
            tax=0;
         else if((i>=1901)&&(i<=21200))
            tax=i*0.15;
         else if((i>=21201)&&(i<60000))
            tax=i*0.25;
         else if(i>=60001)
            tax=i*0.35;
      } 
      else
        System.out.println("Invalid ");   
        
     System.out.println("The tax to be paid is "+ tax + " euros" );  
    }
}