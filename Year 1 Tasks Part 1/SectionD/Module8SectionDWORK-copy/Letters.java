/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section D Q 16*/
// Java program to read data of various types using Scanner class.  
import java.util.*;
public class Letters{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     int letter = (int)(Math.random()*26+'A');
     //can do character for the above function
     char l = (char)(letter);
     char choice = ' ';
     int c=0;
     int count = 3;     
     do{
        System.out.println("Try to guess the randomised letter (enter * to quit)");
         choice  = sc.next().charAt(0); 
         c= Character.toUpperCase(choice);
         if(c=='*'){
          System.out.println("Goodbye , The letter was "+ l);
           count=0;
            }
         else if(c>letter)
          System.out.println("Too high \n You have "+ --count +" choices left");
         else if(c<letter)
          System.out.println("Too low\n You have "+ --count +" choices left");  
          else 
          System.out.println("Invalid"); 
        }while(count!=0);
     System.out.println("The letter was "+ l); 
     
    }
}