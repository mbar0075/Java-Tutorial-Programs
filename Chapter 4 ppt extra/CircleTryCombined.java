

public class CircleTryCombined
{
   
    public static final double pi = 3.142;
    
    
    public static void main (String args[])
    {
        double radius = 2.0;
        System.out.println("Circumference "+getCircumference(radius));
        System.out.println("Circumference "+getArea(radius));
        
        
    }
    
    public static double getCircumference(double radius)
    {
        double circumference = 2 * pi * radius;
        return circumference;
        
    }
    
    
    
    public static double getArea(double radius)
    {
        
        
        return pi * radius * radius;
        
    }
}
