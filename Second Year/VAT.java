import java.util.*;
public class VAT
{
    private static Scanner sc = new Scanner(System.in);
    private static double price;
    private static final double vat =1.18;
    
    public static void main( String args[]){
        price=calcVAT();
        System.out.println("The price including vat is "+price);
    }
    
    private static double calcVAT(){
        System.out.println("Input price that excludes vat");
        price=sc.nextDouble();
        price*=vat;
        return price;
    }
}
