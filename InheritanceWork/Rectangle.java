public class Rectangle
{
    protected double length,width;
  
    public Rectangle(double len,double w)
    {
        length=len;
        width=w;
    }

    public void setLength(double len){
       length = len; 
    }
    
    public void setWidth(double w){
       width=w; 
    }
    
    public double getLength(){
        return length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getArea(){
        return width*length;
    }
}
