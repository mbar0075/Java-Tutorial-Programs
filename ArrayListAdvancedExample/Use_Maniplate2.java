
import java.util.ArrayList;
import java.util.Scanner;

public class Use_Maniplate2
{
   public  void Sales_Menu()
   {
     ArrayList<Car> carList = new ArrayList<Car>();
    ArrayList<Client> clientList = new ArrayList<Client>();
    ArrayList<Client_Car> clientcarList = new ArrayList<Client_Car>();
      Manipulate_Car  mc = new  Manipulate_Car();
    Manipulate_Sale m = new Manipulate_Sale();
    Scanner sc = new Scanner(System.in);
    char choice;

     mc.readList(carList);
     m.readList(clientList,clientcarList);
    
    
   
   do {
             System.out.println("1. Add Sale ");
             System.out.println("2. Display Sales");
             System.out.println("3. Quit\n");
             System.out.println("Make your choice ");
              choice = sc.next().charAt(0);
        
         
         switch (choice)
         {
                case '1' :   m.addSale(carList,clientList, clientcarList);
                            break;
                case '2' : m.display_sales(clientList, clientcarList,carList);
                            break;
                 case '3' : m.writeList(clientList,clientcarList);
                            break;
            }
            } while (choice != '3');
            
        } 
   
     
}

