/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section c Q 10*/
// Java program to read data of various types using Scanner class.  
 import java.util.*;
public class MarkGrade {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input 3 marks out of 100");
     double mark1 = sc.nextDouble();
     double mark2 = sc.nextDouble();
     double mark3 = sc.nextDouble();
     double average = (mark1+mark1+mark3)/3;
     if((average>=0)&&(average<=49))
        System.out.println("Grade F");
     else if((average>=50)&&(average<=65))
        System.out.println("Grade D");
     else if((average>=66)&&(average<=79))
        System.out.println("Grade C");
     else if((average>=80)&&(average<=89))
        System.out.println("Grade B");
     else if((average>=90)&&(average<=100))
        System.out.println("Grade A");   
      
    }
}