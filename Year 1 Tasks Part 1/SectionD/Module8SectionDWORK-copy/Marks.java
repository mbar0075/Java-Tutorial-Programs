/*Matthias Bartolo 
 *Class Bc1B  
 *Module8 Section D Q 14*/
// Java program to read data of various types using Scanner class.  
import java.util.*;
public class Marks{
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     int passed=0;
     int count = 0;
     int failed=0;
     double marks = 0;
     double max = Double.MIN_VALUE;
     String name = null;
     System.out.println("Input the pass mark of the exam");
     double mark =sc.nextDouble(); 
     sc.nextLine();
     System.out.println("Input 10 Student names and marks");
     String n=null;
     do{
        System.out.println("Input Student name ");
        name = sc.nextLine();
        System.out.println("Input Student mark ");
        marks  = Double.parseDouble(sc.nextLine()); 
         if(marks>=mark){
          System.out.println(name + " Passed ");
          passed++;
        }
         else if(marks<=mark){
          System.out.println(name + " Failed");
          failed++;
        }
        if(max<marks){
            max=marks;
            n=name;
        }
        count++;
        }while(count<10);
     System.out.println("There were  "+ passed +" students who passed\n and there were "+failed+" students who failed"); 
     System.out.println("The student who got the highest mark of " +max + " was "+ n);
    }
}