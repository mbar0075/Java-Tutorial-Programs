/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section c Q 12*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
public class Cinema{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input  Age");
     int age  = sc.nextInt();
     int adults;
     int child;
     double total=0;
     
     if(age>16){
         System.out.println("Input quantity of tickets for adults");
         adults  = sc.nextInt();
         System.out.println("Input quantity of tickets for children");
         child  = sc.nextInt();
         if(child>2)
            total=(5*adults)+(3.5*child);
         else
            total=(6*adults)+(3.5*child);
            
      }
     else 
            System.out.println("You are not 16 years old ");   
        
     System.out.println("You are rquired to pay  "+ total + " euros" );  
    }
}