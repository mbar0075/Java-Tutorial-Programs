import java.util.*;
public class op1
{
    private Scanner sc = new Scanner(System.in);
    public String name,surname;
    public long ClientID,CreditCard;
    public int Date;
    private int incorrect=0;
    private int temp=0;
    public void Input(){
        do{
            System.out.println("Enter name");
            name=sc.next();
            incorrect=0;
            for(int i=0; i<name.length();i++){
                temp =(int)(name.charAt(i));
                if((temp>=48)&&(temp<=57))
                    incorrect=1;
            }
            if(incorrect==1)
                System.out.println("Invalid");
        }while(incorrect!=0);
        incorrect=0;
        do{
            System.out.println("Enter surname");
            surname=sc.next();
            incorrect=0;
            for(int i=0; i<surname.length();i++){
                temp =(int)(surname.charAt(i));
                if((temp>=48)&&(temp<=57))
                    incorrect=1;
            }
            if(incorrect==1)
                System.out.println("Invalid");
        }while(incorrect!=0);

        do{
            System.out.println("Enter ClientID");
            try{
                ClientID=sc.nextLong();
            }
            catch(Exception e)
            {
                System.out.println(e);   
            }
            sc.nextLine();
            if(ClientID>10000000)
                System.out.println("Invalid");
        }while(ClientID>10000000);

        do{
            System.out.println("Enter Year of Birth(1950-2002)");
            try{
                Date=sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println(e);   
            }
            sc.nextLine();
            if((Date<1950)||(Date>2002))
                System.out.println("Invalid");
        }while((Date<1950)||(Date>2002));

        do{
            System.out.println("Enter Credit Card Number");
            try{
                CreditCard=sc.nextLong();
            }
            catch(Exception e)
            {
                System.out.println(e);   
            }
            sc.nextLine();
            if((CreditCard>9000000000000000L)||(CreditCard<900000000000000L))
                System.out.println("Invalid");
        }while((CreditCard>9000000000000000L)||(CreditCard<900000000000000L));
    }
}
