/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section c Q 14*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
public class Seasons{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input month number");
     int month  = sc.nextInt();
     
        switch(month){
        case 12:
        case 1:
        case 2:System.out.println(" The season is Winter");
                break;
        case 3:
        case 4:
        case 5:System.out.println(" The season is Spring");
                break;
        case 6:
        case 7:
        case 8:System.out.println(" The season is Summer");
                break;
        case 9:
        case 10:
        case 11:System.out.println(" The season is Autumn");
                break;
                       
        default:System.out.println("Invalid");                  
     }   
    }
}