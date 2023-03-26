import java.util.*;
public class Program8
{
    public static void main(String args[]){
        //Declaring of Variables
        Scanner sc = new Scanner(System.in);
        Diamond d = new Diamond();
        int input=0;
        
        //Outputting and looping Menu
        do{
            System.out.println("DIAMOND DRAWING\nChoose from the following Options\n1. Diamond of numbers \n2. Diamond of letters\n3. Exit");
            try{
                input = sc.nextInt();         
            }
            catch(Exception e){
                System.out.println(e);
            }
            sc.nextLine();
            switch(input){   
                case 1:d.Option1();
                break;
                case 2:d.Option2();
                break;
                case 3:System.out.println("\n\n\n\nGoodbye");
                break;
                default:System.out.println("Invalid Option");
            }
        }while(input!=3);

    }
}
