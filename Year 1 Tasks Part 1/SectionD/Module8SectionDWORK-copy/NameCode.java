/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section D Q 7*/
// Java program to read data of various types using Scanner class.  
import java.util.*;
public class NameCode {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input how many letters your name has ");
     int num = sc.nextInt();
     sc.nextLine();
     char letter ;
     int ans;
     String name="";
   
     for(int i= 1 ; i<=num;i++){
         System.out.println("Input letter "+ i);
        letter = (sc.nextLine()+" ").charAt(0);
        ans= (int)(letter);
        name=name+ans+ " ";
        } 
         System.out.println("Your name is "+ name);
    }
}