/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section c Q 18*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
public class Quiz {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the answer to the following question :\nWhat is the name of the largest country in the world ?\na.China\nb.Australia\nc.Russia\nd.Canada");
        char input = sc.next().charAt(0);
        char ans = Character.toLowerCase(input);
        switch(ans){
            case 'a':
            case 'b':
            case 'd':System.out.println(" You are unfortunately incorrect");
                    break;
                    
            case 'c':System.out.println(" You are correct");
                    break;
         
            default:System.out.println("Invalid");                  
        }    
    }
}