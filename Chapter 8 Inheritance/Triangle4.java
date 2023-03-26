     // A subclass of TwoDShape for triangles.
class Triangle4 extends TwoDShape4 {

    private String style;

    // A default constructor.
    Triangle4() {
        super();
        style = "null";
    }

    // Constructor for Triangle.
    Triangle4(String s, double w, double h) {
        super(w, h, "triangle");
        style = s;
    }

    // Construct an isosceles triangle.
    Triangle4(double x) {
        super(x, "triangle"); // call superclass constructor
        style = "isosceles";
    }

    // Construct an object from an object.
    Triangle4(Triangle4 ob) {
        super(ob); // pass object to TwoDShape constructor
        style = ob.style;
    }

//implementation of the abstract method    
double area() {
        return getWidth() * getHeight() / 2;
    }
    
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}





