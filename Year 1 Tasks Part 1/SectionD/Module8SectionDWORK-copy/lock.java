/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section D Q 11*/
// Java program to read data of various types using Scanner class.  
import java.util.*;
public class lock{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     
     int l1 = 27;
     int l2 = 18;
     int l3 = 54;
     int choice = 3;
     
     while(choice!=0){
         System.out.println("Turn the Dial to the first number(num1)");
         int num1  = sc.nextInt();
         System.out.println("Turn the Dial to the second number(num2)");
         int num2  = sc.nextInt();
         System.out.println("Turn the Dial to the third number(num3)");
         int num3  = sc.nextInt();    
         if((num1==l1)&&(num2==l2)&&(num3==l3)){
             System.out.println("The lock opens !");
             break;
            }
            else{
            System.out.println("Failed to open lock !\nYou have "+ (choice-1)+" chances left");
            choice--;
        }
    }  
    }
}