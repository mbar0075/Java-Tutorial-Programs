// A subclass of TwoDShape for triangles.
class Triangle2 extends TwoDShape2 {
	private String style;

 
 // constructor to initialise TwoDShape portion of object
	Triangle2 (String s, double w, double h) {
		super (w, h); //call superclass constructor
		
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

