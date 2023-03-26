
class Shapes {
    public static void main(String args[]) {
        Triangle t1 = new Triangle("isosceles",4.0,4.0);
        Triangle t2 = new Triangle("right",8.0,12.0);
        
        System.out.println("Info for t1: ");
        t1.showStyle();
        System.out.println(t1); // using toString() method
        
        System.out.println("Area is " + t1.area());
        System.out.println();
        
        System.out.println("Info for t2: ");
        t2.showStyle();
        System.out.println("Area is " + t2.area());
        
        System.out.println();

        Rectangle r1 = new Rectangle(2.0,2.0);
        
        if (r1.isSquare()) System.out.print("Square");
        else System.out.print( "Rectangle"); 
        
        System.out.print(" having area "+r1.area());
    }
}
