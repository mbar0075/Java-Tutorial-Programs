import java.util.*;
public class Main
{
    public static void main(String args[]){
        SecondHandVehicle sv = new SecondHandVehicle("KBC111","Opel",2009,100000,1);

        boolean f=sv.MultipleOwners();
        if(f==true) System.out.println("The Car has multiple Owners");
         else System.out.println("The Car doesn't have multiple Owners"); 
         
        sv.IncrementOwners(); 
        f=sv.MultipleOwners();
        if(f==true) System.out.println("The Car has multiple Owners");
         else System.out.println("The Car doesn't have multiple Owners"); 
         
        System.out.println("Car Registration Number: "+sv.getReg_No());
        System.out.println("Car Value: "+sv.getValue());
        
        System.out.println("The Car has "+sv.calculateAge(2011)+" years ");
        
        System.out.println("The Car value is "+sv.calcdepreciation(2011));
    
    }
}
