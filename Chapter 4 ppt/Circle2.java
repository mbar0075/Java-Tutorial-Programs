

public class Circle2
{
// instance variables
	private double radius, area, circum;
	// encapsulating the variables
	
	public void setRadius(double r)
	{
	    radius = r;
	    //this.radius = radius;
	    // in case the instance variable and parameter have the same name
	   }
	   
   public double getRadius()
   {
       return radius;
    }
    
    
    // setter 
    public void calc_area()
    {
        area = Math.PI * radius * radius;
    }
    
    public double get_area()
    {
        return area;
    }
     
    public void calc_circumference()
    {
        circum = 2 * Math.PI * radius;
    }
    
    public double get_circum()
    {
        return circum;
    }
        
	   
}