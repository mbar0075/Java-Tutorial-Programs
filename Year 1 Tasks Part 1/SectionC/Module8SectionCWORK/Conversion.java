/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section c Q 15*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
public class Conversion{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Choose between the following options:\n1. Pounds to grams\n2. Grams to pounds\n3.Quit");
     int option  = sc.nextInt();
     double amount=0;
     if(option!=3){
         System.out.println("Input amount to convert");
         amount = sc.nextDouble();
        }
     double ans = 0;
     
     switch(option){
        case 1: ans=amount*453.59;
                System.out.println("The answer of the following conversion is "+ans+" grams");
                break;
       
        case 2: ans=amount/453.59;
                System.out.println("The answer of the following conversion is "+ans+" pounds");
                break;
                
        case 3:System.out.println("Goodbye");
                break;
                
        default:System.out.println("Invalid");                  
      }   
    
  }
}