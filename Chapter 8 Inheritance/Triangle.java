// A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
	private String style;

  // constructor to initialise TwoDShape portion of object
	Triangle (String s, double w, double h) {
		setWidth(w);
		setHeight(h);
		
		style = s;
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	/* getWidth() and getHeight() use accessor 
	 * methods provided by superclass
	*/
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}


