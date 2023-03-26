import java.util.*;
public class Cone
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input radius");
        double r= sc.nextDouble();
        System.out.println("Input height");
        double h= sc.nextDouble();
        double area = Math.PI*r*(r+Math.sqrt(Math.pow(r,2)+Math.pow(h,2)));
        System.out.println("The area is "+area);
    }
}
