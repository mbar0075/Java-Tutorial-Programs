import java.util.*;
public class op4
{
    private Scanner sc = new Scanner(System.in);
    private int duration,total,price;
    private String input;
    private int count=0;
    
    public void RentCar(String CarName[],String CarModel[],int CarPrice[],String CarStatus[]){
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
}
