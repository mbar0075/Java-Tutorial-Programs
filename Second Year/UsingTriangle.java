import java.util.*;
public class UsingTriangle
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input height");
        double h = sc.nextDouble();
        System.out.println("Input breadth");
        double b = sc.nextDouble();
        System.out.println("Input taxrate");
        
        Triangle t = new Triangle(h,b);
        
        System.out.println("The area is   "+t.calcArea());
    }
}
