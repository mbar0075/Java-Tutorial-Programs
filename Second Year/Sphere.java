import java.util.*;
public class Sphere
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input radius");
        double r= sc.nextDouble();
        double volume = (4*Math.PI*Math.pow(r,3))/3;
        System.out.println("The area is "+volume);
    }
}
