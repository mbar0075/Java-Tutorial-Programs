/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section c Q 9*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
public class Letters {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input a Letter");
     char letter = sc.next().charAt(0);
     int ascii = (int)(letter);
     
     char l = Character.toUpperCase(letter);
     if((ascii>=65)&&(ascii<91)){   
     if((letter=='A')||(letter=='E')||(letter=='U')||(letter=='I')||(letter=='O')){
         System.out.println(" It is a vowel");
        }   
     else
        System.out.println(" It is a consonant");   
    }  
    else
        System.out.println(" Invalid entry");
    }
}