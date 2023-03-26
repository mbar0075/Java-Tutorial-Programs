import java.util.*;
public class MainClass
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        SubClass s = new SubClass();
        int choice =0;
        int c=0;
        do{
            System.out.println("\nChoose from the following Menu:\n1)Enter Client Details\n2)View Client Details\n3)View Cars available\n4)Rent a Car\n5)Edit,Rent/order\n6)Exit"); 
            try{
                choice=sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println(e);   
            }
            sc.nextLine();
            switch(choice){
                case 1:s.Input();
                c++;
                break;
                case 2:if(c!=1){
                    System.out.println("Invalid ,Please do Option 1 or 4 first");
                    break;
                }
                s.Output();
                break;
                case 3:s.CarsAvailable();
                break;
                case 4:s.RentCar();
                c++;
                break;
                case 5:s.ReOrder();
                break;
                case 6:System.out.println("\nGoodbye");
                break;
                default:System.out.println("\nInvalid");
            }
        }while(choice!=6); 
    }
}
