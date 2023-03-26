import java.util.*;
public class Payroll
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        String names[]= new String[5];
        int hrs[]= new int[5];
        double gross[]= new double[5];
        int count=0;

        int input;
        do{
            System.out.println("Choose from the folowing Menu:\n1.Input names\n2.Input hours worked\n3.Input pay rate\n4.Print payroll\n5.Quit");

            input = sc.nextInt();
            switch(input){
                case 1:
                for ( int i =0; i<5;i++){
                    System.out.println("Input name "+(i+1));
                    names[i]= sc.next();
                }
                count++;
                break;
                case 2:
                for ( int i =0; i<5;i++){
                    System.out.println("Input hours worked "+(i+1));
                    hrs[i]= sc.nextInt();
                }
                count++;
                break;
                case 3:
                for ( int i =0; i<5;i++){
                    System.out.println("Input pay rate "+(i+1));
                    gross[i]= sc.nextDouble();
                }
                count++;
                break;
                case 4:
                if(count>=3){
                    for ( int i =0; i<5;i++){
                        System.out.println(names[i]+"   "+hrs[i]+"   "+gross[i]);
                        double g = hrs[i]*gross[i];
                        double n = g-(g*0.15);
                        System.out.println("The gross wage is "+g+"  the net wage is "+n);
                    }
                }
                break;
                case 5:System.out.println("Goodbye");
                break;
                default:System.out.println("Invalid Entry");   
            }
        }while (input!=5);
    }
}
