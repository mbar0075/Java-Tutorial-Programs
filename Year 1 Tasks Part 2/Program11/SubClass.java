import java.util.*;
public class SubClass
{
    private Scanner sc = new Scanner(System.in);
    private String name,surname;
    private long ClientID,CreditCard;
    private int Date;
    private int incorrect=0;
    private int temp=0;
    private String CarName[]={"Ferrari","Toyota","Lamborghini"};
    private String CarModel[]={"Tributo","Sedan","Aventador"};
    private int CarPrice[] ={250,195,659};
    private String CarStatus[]={"Not taken","Not taken","Not taken"};
    private int duration,total,price;
    private String input;
    private int count=0;

    public void Input()
    {
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
            if((CreditCard>900000000000L)||(CreditCard<90000000000L))
                System.out.println("Invalid");
        }while((CreditCard>900000000000L)||(CreditCard<90000000000L));
    }

    public void Output(){
        System.out.println("name:"+name);
        System.out.println("surname:"+surname);
        System.out.println("ClientID:"+ClientID);
        System.out.println("Date of Birth:"+Date);
        System.out.println("Credit Card Number:"+CreditCard);
    }

    public void CarsAvailable(){
        System.out.println("Manufacturer\t| Model\t\t|Price\t\t|Status");
        for(int i=0;i<CarName.length;i++){
            if(i!=2)
                System.out.print(CarName[i]+"\t\t"+CarModel[i]+"\t\t"+CarPrice[i]+"\t\t"+CarStatus[i]);
            else
                System.out.print(CarName[i]+"\t"+CarModel[i]+"\t"+CarPrice[i]+"\t\t"+CarStatus[i]);
            System.out.println();
        }
    }

    public void RentCar(){
        count=0;
        System.out.println("Choose a car");
        input=sc.next();
        for(int i=0;i<CarName.length;i++){
             if(CarStatus[i].equals("Taken")){
                System.out.println("The Car is taken");
                count=1;
                break;
            }
            else if(input.equalsIgnoreCase(CarName[i])){
                price=CarPrice[i];
                count=0;
                CarStatus[i]="Taken";
                break;
            }
        }
        if(count==0){
            do{
                System.out.println("Enter Duration in Days");
                try{
                    duration=sc.nextInt();
                }
                catch(Exception e)
                {
                    System.out.println(e);   
                }
                sc.nextLine();
            }while(duration<0);
            total=duration*price;
            System.out.println("The total price is "+total);
        }
    }

    public void ReOrder(){
        for(int i=0;i<CarStatus.length;i++){
            CarStatus[i]="Not taken";  
        }
        RentCar(); 
    }
}
