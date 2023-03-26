import java.util.*;
public class Rectangle
{
    private double length,width;
    
    public Rectangle()
    {
    }

    public Rectangle(double l,double w)
    {
        length=l;
        width=w;
    }
    
    public void setLength(double l){
        length=l;
    }
    
    public void setWidth(double w){
        width=w;
    }
    
    public double calcArea(){
       return length*width;        
    }
}
