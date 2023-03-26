
import java.util.Scanner;

public class Sum
{
    public static void main (String args[])
    {
        int a[] = new int[5];
        Scanner Keyboard = new Scanner(System.in);
        int sum=0;
        
        for(int k=0; k< 5 ; k++)
        {
            System.out.print("Enter number "+(k+1)+":");
            a[k] = Keyboard.nextInt();
        }
        
         for(int k=0; k< 5 ; k++)
           sum += a[k];
           
         System.out.println("total is "+sum);
        }
}
