/*Matthias Bartolo BC1B Group A
Question 2*/
import java.util.*;
public class Factorial{
    public static void main (String args[]){
     Scanner sc= new Scanner(System.in);
     System.out.println("Input number to find the factorial of that number");
     int num = sc.nextInt();
     int factorial= 1;
     for (int i= 1; i<=num;i++){
        factorial *=i; 
        }
     System.out.println("The factorial of "+ num + " is "+ factorial);
    }
}