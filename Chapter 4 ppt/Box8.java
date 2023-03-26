
public class Box8
{
            private float width;		
            private float height;
            
            
            public void setWidth(float w) {
                if (w > 0) width = w;
            }
            
            
            public void setHeight (float h) {
                if (h> 0) height = h;
            }    
              
    
            public float getArea() 
                   {
                      return (height * width);
                   }
  }
