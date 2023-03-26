import java.util.*;
public class UsingRectangle
{
    public static void main( String args[]){
        Rectangle r1 = new Rectangle();
        Rectangle r2 ;
        Scanner sc= new Scanner(System.in);
        System.out.println("Input length");
        double l = sc.nextDouble();
        System.out.println("Input width");
        double w = sc.nextDouble();
        r1.setLength(l);
        r1.setWidth(w);
        r2=new Rectangle(5,10);
        System.out.println("The area of r1 is  "+r1.calcArea());
        System.out.println("The area of r2 is  "+r2.calcArea());
    }
}
