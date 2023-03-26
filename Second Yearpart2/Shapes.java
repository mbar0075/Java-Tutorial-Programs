import java.util.*;
public class Shapes {
    public static void main (String args[]) {
        Square s1 = new Square(4,5);
        Rectangle r1 = new Rectangle(5, 6);
        System.out.println(s1.getArea());
        System.out.println(s1.getWidth());
        System.out.println(r1.getArea());
        System.out.println(r1.getWidth());
        System.out.println(r1.getHeight());
    }
}