//Matthias Bartolo 0436103L
import java.util.*;
public class Task1Q1 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //Part A
        int n = -1;
        do
        {
            System.out.println("Input a non-negative integer");
            n = sc.nextInt();
        }
        while(n<=0);
        long factorial = 1;
        for(int i =1;i<=n;i++)
        {
            factorial*=i;  
        }
        System.out.println("The factorial of "+ n +" is "+ factorial);
        //Part B
        if(factorial>1000)
            System.out.println("Greater than ");
        else
            System.out.println("Less than ");
        //Part C
        double avg;
        long diff;
        avg=(factorial+1000)/2;
        if(factorial>1000)
            diff = factorial-1000;
        else
            diff= 1000-factorial;
        System.out.println("The average is "+avg);   
        System.out.println("The difference is "+diff);    
    }
}
 