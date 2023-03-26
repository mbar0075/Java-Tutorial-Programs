import java.util.*;
public class UsingSquare
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length");
        double length = sc.nextDouble();
        
        Square2 s = new Square2(length);
        
        System.out.println("The Area is "+s.getArea());
        System.out.println("The Perimeter is "+s.getPer());
        }
}
