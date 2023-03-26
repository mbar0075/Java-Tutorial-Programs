
public class Use_Circle
{
    public static void main (String args[])
    {
     // Create a circle with radius 5.0
    Circle myCircle = new Circle(5.0);
    System.out.println("The area of the circle of radius "+ myCircle.getRadius() + " is " + myCircle.getArea());

    // Create a circle with radius 1
    Circle yourCircle = new Circle();
    System.out.println("The area of the circle of radius "
      + yourCircle.getRadius() + " is " + yourCircle.getArea());

    // Modify circle radius
    yourCircle.setRadius(100);
  System.out.println("The area of the circle of radius "+ yourCircle.getRadius() + " is " + yourCircle.getArea());
  }
}

