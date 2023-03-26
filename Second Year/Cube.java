import java.util.*;
public class Cube
{
    private double side;
   
    public Cube(){
    }

    public Cube(double s)
    {
        side=s;
    }

    public void setSide(double s)
    {
        side=s;
    }

    public double calcArea()
    {
        return 6*Math.pow(side,2);
    }
    
    public double calcVolume()
    {
        return Math.pow(side,3);
    }
}
