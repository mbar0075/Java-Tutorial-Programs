import java.util.*;
public class Triangle
{
    private double height,base,area;

    public Triangle(double h,double b)
    {
        height=h;
        base=b;
    }

    public double calcArea(){
        area=(base*height)/2;
        return area;
    }
}
