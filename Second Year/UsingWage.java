import java.util.*;
public class UsingWage
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input hours");
        int h = sc.nextInt();
        System.out.println("Input payrate");
        double p = sc.nextDouble();
        System.out.println("Input taxrate");
        double t = sc.nextDouble();
        
        Wage3 w = new Wage3(h,p,t);
        
        System.out.println("The net Wage   "+w.calcWage());
    }
}
