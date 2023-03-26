
class AbsShape {
    public static void main(String args[]) {
        
        TwoDShape4 shapes[] = new TwoDShape4[5];
        shapes[0] = new Triangle4("right", 8.0, 12.0);
        shapes[1] = new Rectangle4(10);
        shapes[2] = new Rectangle4(10, 4);
        shapes[3] = new Triangle4(7.0);
        
        //since shapes[] is of type TwoDShape a typecast is needed
        // to pass an object to the Triangle of type Triangle
         shapes[4] = new Triangle4((Triangle4)shapes[0]);
      
        for(int i=0; i < shapes.length; i++) {
            System.out.println("object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}   




