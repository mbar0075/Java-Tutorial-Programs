import java.util.*;
public class Multiplication
{
    private static Scanner sc = new Scanner(System.in);
    private static int input1,input2;
    private static double input3,input4;

    public static void main( String args[]){
        System.out.println(" 40*5 \t\t"+Multiply(40,5));
        System.out.println(" 3*2*4 \t\t"+Multiply(3,2,4));
        System.out.println(" 4.5*3.2 \t"+Multiply(4.5,3.2));
        
        }

    private static int  Multiply(int x,int y){
        return x*y;
    }

    private static int  Multiply(int x,int y,int z){
        return x*y;
    }

    private static double  Multiply(double x,double y){
        return x*y;
    }

}
