import java.util.*;
public class Convertor
{
    private  Scanner sc = new Scanner(System.in);

    public void euroToSterling(double amount){
        amount*=0.91;
        System.out.println("The amount is "+amount);
    } 
    
    public void SterlingToEuro(double amount){
        amount/=0.91;
        System.out.println("The amount is "+amount);
    } 
    
}
