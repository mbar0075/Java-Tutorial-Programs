import java.util.*;
public class UsingBinary
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        Binary b = new Binary();

        int input,num;
        do{
            System.out.println("Choose from the folowing Menu:\n1.Convert to Binary\n2.Quit");

            input = sc.nextInt();
            switch(input){
                case 1:System.out.println("Input number");
                num=sc.nextInt();
                b.setNumber(num);
                String display =b.toBinary();
                System.out.println(" In binary is "+display);
                break;
                case 2:System.out.println("Goodbye");
                break;
                default:System.out.println("Invalid Entry");   
            }
        }while (input!=2);
    }
}
