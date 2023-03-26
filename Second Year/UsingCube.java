import java.util.*;
public class UsingCube
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        Cube c = new Cube();
        System.out.println("Input side");
        double s = sc.nextDouble();
        c.setSide(s);
        System.out.println("The area is "+c.calcArea());
        System.out.println("The volume is "+c.calcVolume());
    }
}