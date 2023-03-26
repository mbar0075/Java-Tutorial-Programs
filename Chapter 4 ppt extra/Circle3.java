
public class Circle3 {
  /** The radius of the circle */
  private double radius = 1;
 
  public Circle3()
  {}
 
  /** Construct a circle with a specified radius */
  public Circle3(double newRadius) {
    radius = newRadius;
   }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double newRadius) {
     if (newRadius>=0) radius = newRadius;
    else radius = 0;
  }

  /** Return the area of this circle */
  public double getArea() {
    return radius * radius * Math.PI;
  }

    
public void printCircle(Circle3 c) {
    System.out.println("The area of the circle of radius "
      + c.getRadius() + " is " + c.getArea());
  }

 /** Create an array of Circle objects */
  public Circle3[] createCircleArray() {
     Circle3[] circleArray = new Circle3[10];

     for (int i = 0; i < circleArray.length; i++) {
       circleArray[i] = new Circle3(Math.random() * 100);
       }

       // Return Circle array
       return circleArray;
   }
      
     /** Print an array of circles and their total area */
   public void printCircleArray(Circle3[] circleArray) {
     System.out.println("Radius\t\t\t\t" + "Area");
     for (int i = 0; i < circleArray.length; i++) {
       System.out.print(circleArray[i].getRadius() + "\t\t" +
         circleArray[i].getArea() + '\n');
     }

   // Compute and display the result
    System.out.println("The total areas of circles is \t" +
      sum(circleArray));
  }

  /** Add circle areas */
  public double sum(Circle3[] circleArray) {
    // Initialize sum
    double sum2 = 0;

    // Add areas to sum
    for (int i = 0; i < circleArray.length; i++)
      sum2+= circleArray[i].getArea();

      return sum2;
  }
}

