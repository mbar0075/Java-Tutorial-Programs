
import java.util.Scanner;

public class UseCircle2
{
	public static void main (String args[])
	{
	    Scanner keyboard = new Scanner(System.in);
	    Circle2 c = new Circle2();
	    System.out.println("Enter radius ");
	    double rad = keyboard.nextDouble();
	    c.setRadius(rad);
	    
	    System.out.println("Radius is "+ c.getRadius());
	    c.calc_area();
	    
	    System.out.println("Area of circle is "+c.get_area());
	    
	    c.calc_circumference();
	    System.out.println("Circumference is "+c.get_circum());
	    
	   }
}