//Matthias Bartolo 0436103L
import java.util.*;
public class Task1Q2 
{
    public static void main (String args[])
    {
        Scanner sc =  new Scanner(System.in);
        //Part A
        System.out.println("Input decimal number 1");
        double num1 = sc.nextDouble();
        System.out.println("Input decimal number 2");
        double num2 = sc.nextDouble();
        //Part B
        double addition = num1+num2;
        double multiplication = num1*num2;
        double average = addition/2;
        double max = 0;
        double diff = 0;
        System.out.println("The addition of num1 and num2 is "+ addition);
        if(num1>num2)
        {
            
            max= num1;
            diff =num1-num2;
            System.out.println("The difference of num2 from num1 is "+ diff);
        }
        else 
        {
            
            max= num2;
            diff =num2-num1;
            System.out.println("The difference of num1 from num2 is "+ diff);
        }
        System.out.println("The multiplication of num1 with num2 is "+ multiplication);
        System.out.println("The average of num1 fand num2 is "+ average);
        System.out.println("The max number is "+ max);
        //Part C
        int choice = 0;
        int count = -1;
        do
        {
            System.out.println("Input an integer number(Press 0 to Quit)");  
            choice = sc.nextInt();  
            count++;  
        }
        while(choice!=0);
        System.out.println(count);
    }
}
