import java.util.*;
public class MainClass
{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length of cube");
        double len = sc.nextDouble();
        System.out.println("Input width of cube");
        double w = sc.nextDouble();
        System.out.println("Input height of cube");
        double h = sc.nextDouble();

        Cube cube = new Cube(len,w,h);
        System.out.println("The length is "+cube.getLength()+" The width is "+cube.getWidth()+" The height is "+cube.getHeight());

        System.out.println("The base area of the cube is "+cube.getArea());

        System.out.println("The surface area of the cube is "+cube.getSurfaceArea());

        System.out.println("The volume of the cube is "+cube.getVolume());

        System.out.println("Input new length of cube");
        len = sc.nextDouble();
        System.out.println("Input new width of cube");
        w = sc.nextDouble();
        System.out.println("Input new height of cube");
        h = sc.nextDouble();

        cube.setHeight(h);
        cube.setLength(len);
        cube.setWidth(w);

        System.out.println("The base area of the cube is "+cube.getArea());

        System.out.println("The surface area of the cube is "+cube.getSurfaceArea());

    }
}
