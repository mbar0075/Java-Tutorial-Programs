import java.util.*;
public class Calculator
{
    private static Scanner sc = new Scanner(System.in);
    private static int input,ans,num1,num2;

    public static void main( String args[]){
        input =0;
        do{
           System.out.println("Choose from the folowing Menu:\n1.Add\n2.Subtract\n3.Quit"); 
           input = sc.nextInt();
           switch(input){
            case 1:Add(); 
            break;
            case 2:Subtract(); 
            break;
            case 3:Message();
            break;
            default:System.out.println("Invalid Entry");   
            }
        }while (input!=3);
        }

    private static void  Add(){
        System.out.println("Input num1");
        num1 = sc.nextInt();
        System.out.println("Input num2");
        num2 = sc.nextInt();
        ans=num1+num2;
        System.out.println("The answer is "+ans);
    }

    private static void Subtract(){
        ans=0;
        System.out.println("Input num1");
        num1 = sc.nextInt();
        System.out.println("Input num2");
        num2 = sc.nextInt();
        if(num2>num1)
            ans=num2-num1;
        else    
            ans=num1-num2;
        System.out.println("The answer is "+ans);
    }
    
    private static void Message(){
        System.out.println("Thanks for using the program");
    }
}
