
public class Box8
{
            private double width;	  // restricting access to width	
            private double height;  // restricting access to height      
         
            public void setWidth(double w) {
                if (w > 0) width = w;
            }
                 
            public void setHeight (double h) {
                if (h> 0) height = h;
            }    
              
                public double getArea() 
                   {
                      return (height * width);
                   }
  }

