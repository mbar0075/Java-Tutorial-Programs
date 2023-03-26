import java.util.*;
public class Option2
{
    Scanner sc = new Scanner(System.in);
    public ArrayList quantitys=new ArrayList();
    public ArrayList quantitym=new ArrayList();
    public ArrayList quantityl=new ArrayList();
    public int total =0;
    private int choice;
    private int count;
    private int input;
    private int check;
    void OrderDonuts(){
        do{
            System.out.println("Choose from the following Sub Menu:\n1.Small\n2.Medium\n3.Large\n4.Exit");
            try{
                choice=sc.nextInt() ;
            }
            catch(InputMismatchException e){        
                System.out.println(e);   
            }
            sc.nextLine();
            switch(choice){  
                case 1:count=1;
                System.out.println("Input quantity ");
                input=sc.nextInt();
                quantitys.add(input);
                total+=count*input;
                System.out.println("The total is €" +total);
                break;
                case 2:count=2;
                System.out.println("Input quantity ");
                input=sc.nextInt();
                quantitym.add(input);
                total+=count*input;
                System.out.println("The total is €" +total);
                break;
                case 3:count=3;
                System.out.println("Input quantity ");
                input=sc.nextInt();
                quantityl.add(input);
                total+=count*input;
                System.out.println("The total is €" +total);
                break;
                case 4:System.out.println("Go back to Main Menu");
                break;
                default:System.out.println("Invalid");
            }
        }while(choice!=4);
        System.out.println("Quantities of small donuts " +quantitys);
        System.out.println("Quantities of medium donuts " +quantitym);
        System.out.println("Quantities of large donuts " +quantityl);
        System.out.println("The total is €" +total);
    }
}
