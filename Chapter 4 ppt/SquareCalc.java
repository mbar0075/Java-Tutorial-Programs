
// the following method uses the class FindSquare
public class SquareCalc
 {
   public static void main( String[] args ) {
      	
     FindSquare s = new FindSquare();
	 FindSquare t = new FindSquare();
     int x = 4;
     int y = 5;
	
     System.out.println("The Square of "+x + " is "+s.square(x));
     System.out.println("The Square of "+y + " is "+t.square(y));
    }
}
