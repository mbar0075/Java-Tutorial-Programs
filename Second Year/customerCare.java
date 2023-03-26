import java.util.*;
public class customerCare {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Input ID of a customer");
        String id = sc.next();
        System.out.println("Input name of a customer");
        String name = sc.next();
        System.out.println("Input surname of a customer");
        String surname = sc.next();
        
        Customers c = new Customers(id,name,surname);
        loyaltyCard l = new loyaltyCard(c);
        
        int input ;
        boolean check = false;
        do  {
            System.out.println("1. Add points \n2. Redeem points \n3. Show point balance \n4. Show Details \n5. Edit customer details\n6 .Quit");
            input = sc.nextInt();
            switch (input) {
                case 1: 
                System.out.println("Input shopping cost ");
                double shop = sc.nextDouble();
                System.out.println("Input number of points obtained ");
                int pts = sc.nextInt();
                shop +=(pts*10);
                l.addPoints(shop);                
                break;
                case 2:
                System.out.println("Input number of points to redeem ");
                int pts2 = sc.nextInt();
                l.redeemPoints(pts2);
                break;
                case 3:
                l.showBalance();
                break;
                case 4:
                l.showDetails(c);
                break;
                case 5:
                System.out.println("Choose which customer detail you want to edit\n1.ID\n2.name\n3.surname ");
                int choice = sc.nextInt();
                System.out.println("Kindly input updated detail ");
                String temp = sc.next();
                if(choice ==1)
                    c.editID(temp);
                else if(choice ==2)
                    c.editName(temp);
                else if(choice ==3)
                    c.editSurname(temp); 
                else
                    System.out.println("Invalid Entry");
                break;
                case 6:System.out.println("Goodbye");
                break;
                default:
                System.out.println("Invalid input");
            }
        }while (input != 6);
    }
}