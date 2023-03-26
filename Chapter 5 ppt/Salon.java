
import java.util.Scanner;

public class Salon
{
   public void inputServices (String[] service, double[] price, int[] minutes)
   {
       Scanner sc = new Scanner(System.in);
       for (int k = 0; k < service.length; k++)
       {
           System.out.println("Enter service "+ (k+1)+ "  ");
           service[k] = sc.next();
           System.out.println("Enter price for service  "+ (k+1)+ "  ");
           price[k] = sc.nextDouble();
           System.out.println("Enter duration for service " + (k+1)+ "  ");
           minutes[k] = sc.nextInt();
        }
           
    }
    
    
     public  void display(String[] s,double[] p, int[]  t )
  {
    int sz = s.length;
    
    System.out.printf("%20s%7s%25s%n", "Description", "Price", "Duration in Minutes");
    System.out.printf("%20s%7s%25s%n", "===========", "=====", "===================");
    for(int x = 0; x < sz; ++x)
    {
      System.out.printf("%20s%7.2f%10d%n",s[x], p[x], t[x]);
      System.out.println();
    }
  }
  
  
  public int search_Service_position (String[] s, String service)
  {
     // boolean found = false;
      for(int x = 0; x < s.length; ++x)
      {
         if(service.equals(s[x]))
         {// found = true;
           return x;  // position where the service is found
        }
       }
        return -1;  // not found
    }
    
    public void display_service (String[] s,double[] p, int[]  t, int posi)
    {
        System.out.println("Service "+s[posi]);
        System.out.println("Price for service €"+ p[posi]);
        System.out.println("Duration for service "+ t[posi] + " minutes");
    }    
}
