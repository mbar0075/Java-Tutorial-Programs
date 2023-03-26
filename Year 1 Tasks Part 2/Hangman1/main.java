import java.util.*;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        otherClass obj = new otherClass();
        int choice=1;
        do{
            System.out.println("Choose between the following\n1.GuessWord\n2.GuessChar\nPress 0 to Quit");
            choice = sc.nextInt();
                obj.hyphen();
            switch (choice){
                case 1 :obj.GuessWord();
                break;
                case 2 :obj.GuessChar();
                break;
                case 0 :System.out.println("Goodbye");
                break;
                default:System.out.println("Invalid");          
            }    
        } while((choice!=0)&&(obj.tries !=0));
        
    }
    

}