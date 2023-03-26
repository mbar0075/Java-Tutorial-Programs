import java.util.*;
public class Random
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        double num = Math.random()*40+1;
        System.out.println("The number is "+num);
        System.out.println("The number is "+Math.round(num));
    }
}
