/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section c Q 7*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
public class LogIn{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input username ");
     String username = sc.nextLine();
     System.out.println("Input password ");
     String password = sc.nextLine();
     
     if((username.equals("atanti"))&&(password.equals("hfhQEYU88!")))
        System.out.println("Welcome ");
     else
        System.out.println("Invalid Entry");
    }
}