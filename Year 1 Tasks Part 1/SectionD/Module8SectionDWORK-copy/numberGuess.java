/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section D Q 9*/
// Java program to read data of various types using Scanner class.  
import java.util.*;
public class numberGuess{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     int ans = (int)(Math.random()*10+1);
     System.out.println("Guess the generated number ");
     int guess= sc.nextInt();
     int count=0;
     
     while(guess!=ans){
         System.out.println("You are unfortunately incorrect , re-enter number ");
         guess= sc.nextInt();
         count++;
        }
     System.out.println("You have manged to guess the random number which was "+ ans+ " in "+ count + " tries");       
    }
}