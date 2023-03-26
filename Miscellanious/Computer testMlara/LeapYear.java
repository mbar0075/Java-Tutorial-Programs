/*Matthias Bartolo BC1B Group A
Question 1*/
import java.util.*;
public class LeapYear{
    public static void main (String args[]){
     Scanner sc= new Scanner(System.in);
     int num = 1;
     while(num!=0){  
         System.out.println("Input year \nPress 0 to Quit");
         num = sc.nextInt();
     if(num==0)
            System.out.println("Goodbye");    
     else if (((num%4)==0)) 
            System.out.println("It is a leap year");
     else if(((num%100)==0)&&((num%400)==0)) 
            System.out.println("It is a leap year");
     else 
            System.out.println("It is not a leap year");
        }
       }
    }
