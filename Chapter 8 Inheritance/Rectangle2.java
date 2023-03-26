// A subclass of TwoDShape for rectangles.
class Rectangle2 extends TwoDShape2 {
	
	// constructor
	Rectangle2 (double w, double h) {
		super (w,h); //call superclass constructor
	}
	
	boolean isSquare() {
		if(getWidth() == getHeight()) return true;
		return false;
	}
	
	double area() {
		return getWidth() * getHeight();
	}
}
