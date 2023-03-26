
import java.io.*; 
// Serializable is in the java.io package
// Saving objects on  file
public class Box implements Serializable
{
// these two values will be saved
    private int width;
    private int height;
	
    public void setWidth(int w)
    { width = w;}
    
    public void setHeight (int h)
    { height = h;}
    
    public int getHeight ()
    { return height; }
    
    public int getWidth()
    { return width;}
    
    public String toString()
   {
        return getWidth() + "  " + getHeight();
   }
    
}   