import java.util.*;
public class Equilateral
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length of one side of an equilateral triangle");
        double a= sc.nextDouble();
        double area = (Math.sqrt(3)/4)*Math.pow(a,2);
        System.out.println("The area is "+area);
    }
}
