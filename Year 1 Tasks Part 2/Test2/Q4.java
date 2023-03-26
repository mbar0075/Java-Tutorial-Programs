import java.util.*;
public class Q4
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        SubClass2 s = new SubClass2();
        int array[] = new int[10];
        s.Input(array);
        int choice =0;

        do{
            System.out.println("\nChoose from the following Menu:\n1)Search\n2)Prime Numbers\n3)Exit"); 
            try{
                choice=sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println(e);   
            }
            sc.nextLine();
            switch(choice){
                case 1:s.Search(array);
                break;
                case 2:s.Prime(array);
                break;
                case 3:System.out.println("\nGoodbye");
                break;
                default:System.out.println("\nInvalid");
            }
        }while(choice!=3);
    }
}
