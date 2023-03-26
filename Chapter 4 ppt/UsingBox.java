
public class UsingBox
{
    public static void main (String args[])
    {
     
       Box b = new Box(); 
       
        b.width = 5.4f;  //assign 3.4 to width using class box
        b.height = 6.3f; //
       
      // get the area
 
       float area = b.getArea();
       	System.out.println("Area of box is "+area);
        System.out.println("Area of box is "+b.getArea());
    }    
}
