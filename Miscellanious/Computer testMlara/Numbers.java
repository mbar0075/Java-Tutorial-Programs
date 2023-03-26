/*Matthias Bartolo BC1B Group A
Question 3*/
import java.util.*;
public class Numbers{
    public static void main (String args[]){
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter how many numbers you wish to input");
     int num = sc.nextInt();
     double max = -10000000;
     double min = 1000000;
     double n = 0;
     for (int i= 1; i<=num;i++){
        System.out.println("Input number "+i);
        n = sc.nextDouble(); 
        if ( max <n) 
            max= n; 
        if ( min>n) 
            min= n;     
        }
     System.out.println("The largest number was  " + max+"\nThe smallest number was  " + min);
    }
}