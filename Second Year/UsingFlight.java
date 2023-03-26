import java.util.*;
public class UsingFlight
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        Flight f1 = new Flight();
        
        String destination;
        int input =0;
        double aprice,cprice,adults,children;
        do{
            System.out.println("Choose from the folowing Menu:\n1.Input Destination\n2.Input Prices\n3.Input Number of Passengers\n4.Calculate total\n5.Show Bill\n6.Quit"); 
            input = sc.nextInt();
            switch(input){
                case 1:System.out.println("Input destination");
                destination= sc.next();
                f1.setDestination(destination);
                break;
                case 2:System.out.println("Input adult price");
                aprice= sc.nextDouble();
                f1.setAprice(aprice);
                System.out.println("Input child price");
                cprice= sc.nextDouble();
                f1.setCprice(cprice);
                break;
                case 3:System.out.println("Input number of adults");
                adults= sc.nextDouble();
                f1.setAdults(adults);
                System.out.println("Input number of children");
                children= sc.nextDouble();
                f1.setChildren(children);
                break;
                case 4:System.out.println("The total is "+f1.calculateTotal());
                break;
                case 5:f1.showDetails();
                break;
                case 6:System.out.println("Goodbye");
                break;
                default:System.out.println("Invalid Entry");   
            }
        }while (input!=6);
        }
}
