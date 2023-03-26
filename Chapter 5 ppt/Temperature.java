import java.util.Scanner;
public class Temperature {
    public void  enterTemps(double[] temperatureOut)
    {
        Scanner sc = new Scanner (System.in);
       
       for (int i = 0; i < temperatureOut.length; i++)
        {
            System.out.println ("Enter max temperature for day "+ (i+1));
            temperatureOut[i] = sc.nextDouble();
        }
    }

    
   public void displayTemps(double[] temperatureIn)
    {
        for (double item : temperatureIn)
        {
            System.out.println(item);
        }
    }
}
