import java.util.*;
public class Runner
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        NumberUtil number= new NumberUtil();
        System.out.println("Input x");
        int x = sc.nextInt();

        boolean result = number.Even(x);
        if(result==false)
            System.out.println("The number is not even");
        else
            System.out.println("The number is even");

        System.out.println("Input y");
        int y = sc.nextInt();
        System.out.println("The maximum of x and y is "+number.getMaxOf(x,y));

        System.out.println("Input n");
        int n = sc.nextInt();
        System.out.println("The factorial is "+number.getFactorial(n));
    }
}
