import java.util.*;
public class Use_Members 
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Member id");
        int id= sc.nextInt();
        System.out.println("Input name");
        String name= sc.next();
        System.out.println("Input surname");
        String surname= sc.next();
        System.out.println("Input phone number");
        int number= sc.nextInt();

        System.out.println("input whether member is Junior or Senior");
        String member=sc.next();

        Senior_Member senior=null;
        Junior_Member junior=null;
        int num =0;
        int choice =0;
        do{
            System.out.println("Choose from the following options");
            System.out.println("1.Add Senior");
            System.out.println("2.Add Junior");
            System.out.println("3.Edit Phone Number Senior");
            System.out.println("4.Edit Phone NUmber Junior");
            System.out.println("5.Quit");
            choice = sc.nextInt();
            switch (choice){
                case 1: senior=new Senior_Member(name,surname,id,number);            
                break;
                case 2: junior=new Junior_Member(name,surname,id,number);
                break;
                case 3:System.out.println(senior);
                System.out.println("Input new number");
                num = sc.nextInt();
                senior.ChangePhone(num);
                System.out.println(senior);
                break;
                case 4:System.out.println(junior);
                System.out.println("Input new number");
                num = sc.nextInt();
                junior.ChangePhone(num);
                System.out.println(junior);
                break;
                case 5:System.out.println("Goodbye");
                break;
                default:System.out.println("Invalid");                
            }
        }
        while(choice!=5);
    }
}
