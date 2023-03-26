import java.util.*;
public class Option3
{
    Scanner sc= new Scanner(System.in); 
    Option2 op2;
    private int choice =0;
    private int input =0;

    public Option3(Option2 o){
        op2 = o;
    }

    void EditOrder(){
        System.out.println("Quantities of small donuts " +op2.quantitys);
        System.out.println("Quantities of medium donuts " +op2.quantitym);
        System.out.println("Quantities of large donuts " +op2.quantityl);
        System.out.println("The total is " +op2.total);
        do{
            System.out.println("If you want to remove any quantities , choose form the following Options:\n1.Small\n2.Medium\n3.Large\n4.Exit");
            try{
                choice=sc.nextInt() ;
            }
            catch(InputMismatchException e){        
                System.out.println(e);   
            }
            sc.nextLine();
            switch(choice){  
                case 1:System.out.println("Enter the amount you want to remove");
                input=sc.nextInt();
                op2.quantitys.remove((Object)input);
                op2.total-=input;
                System.out.println("The total is €" +op2.total);
                break;
                case 2:System.out.println("Enter the amount you want to remove");
                input=sc.nextInt();
                op2.quantitym.remove((Object)input);
                op2.total-=input;
                System.out.println("The total is €" +op2.total);
                break;
                case 3:System.out.println("Enter the amount you want to remove");
                input=sc.nextInt();
                op2.quantityl.remove((Object)input);
                op2.total-=input;
                System.out.println("The total is €" +op2.total);
                break;
                case 4:System.out.println("Go back to Main Menu");
                break;
                default:System.out.println("Invalid");
            }
        }while(choice!=4);
        System.out.println("Quantities of small donuts " +op2.quantitys);
        System.out.println("Quantities of medium donuts " +op2.quantitym);
        System.out.println("Quantities of large donuts " +op2.quantityl);
        System.out.println("The total is €" +op2.total);
    }
}
