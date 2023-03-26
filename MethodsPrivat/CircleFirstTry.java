import java.util.Scanner;
public class CircleFirstTry
{
    // instance variables - replace the example below with your own
    public static final double pi = 3.14159;
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Input radius");
        double radius=sc.nextDouble();
        System.out.println("The area is "+area(radius));
        System.out.println("The circumference is "+circum(radius));
    }

    public static double area(double r)
    {
        return pi*Math.pow(r,2);
    }

    public static double circum(double r)
    {
        return 2*pi*r;
    }

}
