 import java.util.Scanner;
public class SalonRunner
{
  

   public static void main (String args[])
    {
       String[] services = new String[2];
       double [] prices = new double[2];
       int [] times = new int[2];
       
        Salon ser = new Salon();
        
        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter("\n");
        
        ser.inputServices(services, prices, times);
        ser.display(services, prices, times);
        System.out.println("Enter Service to Search to display its information ");
        String temp = keyboard.next();
        
        Salon s = new Salon();
        
        int position = s.search_Service_position(services, temp);
        if (position != -1) s.display_service(services, prices, times, position);
        else System.out.println(temp + " not found ");
     }
    
}
    

