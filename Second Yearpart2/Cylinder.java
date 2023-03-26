public class Cylinder extends Circle
{
    private double height;
    
    public Cylinder()
    {
    }

    public Cylinder(double height)
    {
        this.height=height;
    }
    
    public Cylinder(double height,double radius)
    {
        super(radius);
        this.height=height;
    }
    
    public Cylinder(double height,double radius,String colour)
    {
        super(radius,colour);
        this.height=height;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
      this.height=height;  
    }
    
    public double getVolume(){
      return getArea()*height;  
    }
    
    public double getSurfaceArea(){
        return (2*Math.PI*radius*height+2*Math.PI*Math.pow(radius,2));
    }
    
    public String toString(){
       return super.toString()+"\t"+height; 
    }
}
