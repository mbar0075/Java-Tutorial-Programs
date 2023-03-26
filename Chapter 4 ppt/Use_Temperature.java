
import java.util.Scanner;

public class Use_Temperature
{
   public static void main (String args[])
   {
       Temperature t = new Temperature();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter temperature ");
      double temp = sc.nextDouble();
       t.setTemp(temp);
       System.out.println("Temperature is "+ t.getTemp());
       
       
       
    }
}
