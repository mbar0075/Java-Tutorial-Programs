

 class TwoDShape {
	protected double width; 
	protected double height; 
  /* private members cannot be accessed from other 
   * classes; accessor methods have  to be used to 
   * set and get private members
   */
   	
   	// Accessor methods for width and height.
	double getWidth()  {
		 return width; 
	}
	
	double getHeight() { 
		return height; 
	}
	
	void setWidth(double w) {
		 width = w; 
	}
	
	void setHeight(double h) { 
		height = h; 
	}

   		
	// this method can be used to display object
public String toString() {
         return "Width "+ width + " Height " + height;
	}

}