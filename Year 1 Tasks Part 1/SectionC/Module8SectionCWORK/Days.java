/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section c Q 16*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
public class Days{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input month number");
     int month  = sc.nextInt();
     
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:System.out.println(" The month you entered has 31 days");
                    break;
            case 4:
            case 6:
            case 9:
            case 11:System.out.println(" The month you entered has 30 days");
                    break;
            case  2:System.out.println(" The month you entered has 28 and 1/4 days ");
                    break;
                       
            default:System.out.println("Invalid");                  
     }    
  }
}