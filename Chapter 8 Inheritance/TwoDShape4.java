
// Create an abstract class.
abstract class TwoDShape4 {
    private double width;
    private double height;
    private String name;
   
    // A default constructor.
    TwoDShape4() {
        width = height = 0.0;
        name = "null";
    }

    // Parameterized constructor.
    TwoDShape4(double w, double h, String n) {
            width = w;
            height = h;
            name = n;
        }

        // Construct object with equal width and height.
   TwoDShape4(double x, String n) {
        width = height = x;
        name = n;
    }
    // Construct an object from an object.
    TwoDShape4(TwoDShape4 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Accessor methods for width and height.
        double getWidth() { return width; }
    
        double getHeight() { return height; }

        void setWidth(double w) { width = w; }

        void setHeight(double h) { height = h; }

        String getName() { return name; }

        void showDim() {
                System.out.println("Width and height are " +  width + " and " + height);
       }

       // Now, area() is abstract, reason being different shapes have different areas
            abstract double area();
       

    }

