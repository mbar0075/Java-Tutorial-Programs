import java.util.*;
public class Question1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("a.Area of a Rectangle");
        System.out.println("Input length in cm");
        double l = sc.nextDouble();
        System.out.println("Input breadth in cm");
        double b = sc.nextDouble();
        double area1 = l*b;
        System.out.println("The area of rectangle is "+ area1 +" cm squared");

        System.out.println("b.Area of Circle");
        System.out.println("Input radius");
        double r  = sc.nextDouble();
        final double pi= 3.142;
        double area2 = pi*r*r;
        System.out.println("The area of circle is "+ area2 +" cm squared");

        System.out.println("c.Greatest area");
        if(area1>area2)
            System.out.println("The area of the Rectangle is larger");
        else
            System.out.println("The area of the Circle is larger");

        System.out.println("d.Swap");  
        double c = 0;
        c= area1;
        area1 =area2;
        area2=c;
        System.out.println("The contents of the area of the rectangle is "+ area1);
        System.out.println("The contents of the area of the circle is "+ area2);
    }
}