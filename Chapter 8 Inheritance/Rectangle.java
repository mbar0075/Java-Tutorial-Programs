
// A subclass of TwoDShape for rectangles.
class Rectangle extends TwoDShape {
	
	// constructor
	Rectangle (double w, double h) {
		setWidth(w);
		setHeight(h);
		
	}
	
	boolean isSquare() {
		if(getWidth() == getHeight()) return true;
		return false;
	}
	
	double area() {
		return getWidth() * getHeight();
	}
}
