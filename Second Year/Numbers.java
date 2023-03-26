import java.util.*;
public class Numbers
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input num 1");
        int num1= sc.nextInt();
        System.out.println("Input num 2");
        int num2= sc.nextInt();
        int max = Math.max(num1,num2);
        System.out.println("The max is "+max);
    }
}
