import java.util.*;
public class Wage2
{
    private static Scanner sc = new Scanner(System.in);
    private static double hours,payRate,grosswage,netwage,taxRate,taxPaid; 

    public static void main( String args[]){
        System.out.println("Input number of hours worked");
        hours=sc.nextDouble();
        System.out.println("Input Pay rate");
        payRate=sc.nextDouble();
        System.out.println("Input tax rate as a decimal");
        taxRate=sc.nextDouble();

        grosswage=grossWage(hours,payRate);
        System.out.println("The gross wage is "+grosswage);
        taxPaid=taxPaid(grosswage,taxRate);
        System.out.println("The taxPaid wage is "+taxPaid);
        netwage=netWage(grosswage,taxPaid);
        System.out.println("The net wage is "+netwage);
    }

    private static double grossWage(double h, double p){
        return h*p;
    }

    private static double taxPaid(double g, double t){
        return g*t;
    }

    private static double netWage(double g, double t){
        return g-t;
    }
}
