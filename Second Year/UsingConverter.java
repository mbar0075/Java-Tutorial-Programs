import java.util.*;
public class UsingConverter
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        Convertor c = new Convertor();
        
        int input;
        double amount;
        do{
            System.out.println("Choose from the folowing Menu:\n1.Euro to Sterling\n2.Sterling to Euro\n3.Quit");
            
            input = sc.nextInt();
            switch(input){
                case 1:System.out.println("Input amount");
                amount=sc.nextDouble();
                c.euroToSterling(amount);
                break;
                case 2:System.out.println("Input amount");
                amount=sc.nextDouble();
                c.SterlingToEuro(amount);
                break;
                case 3:System.out.println("Goodbye");
                break;
                default:System.out.println("Invalid Entry");   
            }
        }while (input!=3);
        }
}
