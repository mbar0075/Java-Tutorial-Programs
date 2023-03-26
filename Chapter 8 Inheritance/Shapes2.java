
class Shapes2 {
	public static void main(String args[]) {
		Triangle2 t1 = new Triangle2("isosceles",4.0,4.0);
		Triangle2 t2 = new Triangle2("right",8.0,12.0);
		
		
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is " + t1.area());
		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());
		
		System.out.println();
		Rectangle2 r1 = new Rectangle2(2.0,2.0);
		r1.showDim();
		if (r1.isSquare()) System.out.print("Square");
		else System.out.print( "Rectangle"); 
		
		System.out.print(" having area "+r1.area());
	}
}
