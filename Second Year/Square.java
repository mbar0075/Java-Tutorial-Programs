import java.util.*;
public class Square
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length of one side of square");
        double l= sc.nextDouble();
        double area = Math.pow(l,2);
        System.out.println("The area is "+area);
    }
}
