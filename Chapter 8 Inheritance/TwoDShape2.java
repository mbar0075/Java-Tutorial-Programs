class TwoDShape2 {
	protected double width; 
	protected double height; 
  /* private members cannot be accessed from other 
   * classes; accessor methods have  to be used to 
   * set and get private members
   */
     	
   	// Parameterized constructor
   	TwoDShape2 (double w, double h){
   		width = w;
   		height = h;
   	}
   	
   	
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

   		
	void showDim() {
	  System.out.println("Width and height are " +
			width + " and " + height);
	}
}

