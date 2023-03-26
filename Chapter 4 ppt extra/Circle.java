 
// Define the circle class with two constructors
class Circle {
  private double radius;

  /** Construct a circle with radius 1 */
  Circle() {
    radius = 1.0;
  }

  /** Construct a circle with a specified radius */
  Circle(double newRadius) {
    radius = newRadius;
  }

  /** Return the area of this circle */
  double getArea() {
    return radius * radius * Math.PI;
  }
  
  public double getRadius()
  {
      return radius;
    }
    
  public void setRadius(double newRadius)
  {
      radius = newRadius;
    }
}


