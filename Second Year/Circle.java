import java.util.*;
public class Circle
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input radius");
        double r= sc.nextDouble();
        double area = Math.PI*Math.pow(r,2);
        double per =2*Math.PI*r;
        System.out.println("The area is "+area);
        System.out.println("The perimeter is "+per);
    }
}
