import java.util.*;
public class Main
{    
    public static void main(String args[]){
        String CarName[]={"Ferrari","Toyota","Lamborghini"};
        String CarModel[]={"Tributo","Sedan","Aventador"};
        int CarPrice[] ={250,195,659};
        String CarStatus[]={"Not taken","Not taken","Not taken"};
        
        Scanner sc = new Scanner(System.in);
        op1 o1= new op1();
        op2 o2= new op2(o1);
        op3 o3= new op3();
        op4 o4= new op4();
        op5 o5= new op5();
        int choice =0;
        int c=0;
        System.out.println("Car Hire");
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
                case 1:o1.Input();
                c++;
                break;
                case 2:if(c!=1){
                    System.out.println("Invalid ,Please do Option 1 or 4 first");
                    break;
                }
                o2.Output();
                break;
                case 3:o3.CarsAvailable(CarName,CarModel,CarPrice,CarStatus);
                break;
                case 4:o4.RentCar(CarName,CarModel,CarPrice,CarStatus);
                c+=2;
                break;
                case 5:if(c!=2){
                    System.out.println("Invalid ,Please do Option 4 first");
                    break;
                }
                o5.ReOrder(CarName,CarModel,CarPrice,CarStatus);
                break;
                case 6:System.out.println("\nGoodbye");
                break;
                default:System.out.println("\nInvalid");
            }
        }while(choice!=6); 
    }
}
