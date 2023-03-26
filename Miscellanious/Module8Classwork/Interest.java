import java.util.*;
public class Interest {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter amount invested");
        double p = sc.nextDouble();
        System.out.println("Enter rate of interest (decimal point)");
        double r = sc.nextDouble();
        System.out.println("Enter Time invested in years");
        int t = sc.nextInt();
        double a = p*(1+r*t);
        
        System.out.println("The simple interest is "  + a + " euros");
    }
}