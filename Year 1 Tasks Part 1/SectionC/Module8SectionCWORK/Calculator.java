/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section c Q 17*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
public class Calculator{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input the first number(num1)");
     int num1 = sc.nextInt();
     System.out.println("Input the second number(num2)");
     int num2 = sc.nextInt();
     
     int ans = 0;
     
     System.out.println("Choose between the following options:\n1. Addition\n2. Subtraction\n3.Quit");
     int option  = sc.nextInt();     
     switch(option){
        case 1: ans=num1+num2;
                System.out.println("The answer of adding num1 and num2 is " + ans);
                break;
       
        case 2: if(num1>num2){
                  ans = num1-num2;
                  System.out.println("The answer of subtracting num2 from num1 is " + ans);
                }
                else if(num2>num1){  
                  ans = num2-num1; 
                  System.out.println("The answer of subtracting num1 from num2 is " + ans);
                }
                break;
                
        case 3:System.out.println("Goodbye");
                break;
                
        default:System.out.println("Invalid");                  
      }   
  }
}