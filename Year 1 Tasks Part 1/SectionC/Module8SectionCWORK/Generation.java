/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section c Q 11*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
public class Generation {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input Year you were born");
     int year = sc.nextInt();
     
     if((year>=1925)&&(year<=1945))
        System.out.println("You are from the Silent Generation");
     else if((year>=1946)&&(year<=1964))
        System.out.println("You are from the Baby Boom Generation");
     else if((year>=1965)&&(year<=1980))
        System.out.println("You are from the Generation X");
     else if((year>=1981)&&(year<=1994))
            System.out.println("You are from the Millenials Generation");
     else if((year>=1995)&&(year<=2012))
        System.out.println("You are from Gen Z");
     else if((year>=2013)&&(year<=2025))
        System.out.println("You are from Gen Alpha");
     else
        System.out.println("You are Old and Outdated");
      
    }
}