
import java.util.Scanner;
public class MainClass
{
     public static void main (String args[])
    {
        char choice;
        Scanner sc = new Scanner(System.in);
        
        Use_ManipulateCar2  um = new Use_ManipulateCar2();
        Use_Maniplate2      um2  = new Use_Maniplate2();
         do {
             System.out.println("1. Cars Menu ");
             System.out.println("2. Sales Menu");
             System.out.println("3. Quit\n");
             System.out.println("Make your choice ");
              choice = sc.next().charAt(0);
        
         
         switch (choice)
         {
                case '1' :   um.CarMenu();
                            break;
                case '2' :  um2.Sales_Menu();
                            break;
                 case '3' :
                            break;
            }
            } while (choice != '3');
            
        } 
   
        
        
    }

