public class Circle
{
    protected double radius;
    protected String colour;
    
    public Circle()
    {
    }
    
    public Circle(double radius )
    {
        this.radius=radius;
    }
    
    public Circle(double radius , String colour)
    {
        this.radius=radius;
        this.colour=colour;
    }

    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius=radius;
    }
    
    public String getColour(){
        return colour;
    }
    
    public void setColour(String colour){
        this.colour=colour;
    }
    
    public double getArea(){
        return (Math.PI*Math.pow(radius,2));
    }
    
    public String toString(){
        return radius+"\t"+colour;
    }
}
