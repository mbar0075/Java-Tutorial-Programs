

// A subclass of TwoDShape for rectangles.
class Rectangle4 extends TwoDShape4 {

    // A default constructor.
        Rectangle4() {
            super();
        }

    // Constructor for Rectangle.
        Rectangle4(double w, double h) {
            super(w, h, "rectangle"); // call superclass constructor
        }

        // Construct a square.
        Rectangle4(double x) {
                super(x, "rectangle"); // call superclass constructor
            }

            // Construct an object from an object.
            Rectangle4(Rectangle4 ob) {
                super(ob); // pass object to TwoDShape constructor
            }

            boolean isSquare() {
                if(getWidth() == getHeight()) return true;
                return false;
            }
          
 // implementation of the abstract method    
            double area() {
                return getWidth() * getHeight();
            }
}

