/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section B Q 13*/
// Java program to read data of various types using Scanner class. 
import java.util.*;
public class Time {
   public static void main (String args[]){
     Scanner sc = new Scanner(System.in); 
     System.out.println("Input any number of minutes");
     int minutes = sc.nextInt(); 
     int days = minutes/24;
     int years = days/365;
     int d2 =days- (years*365);
     System.out.println("The equilivalent of " + minutes + " minutes is "+ years + " years and "+ d2 + "days" );  
    }
}