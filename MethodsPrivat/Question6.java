import java.util.Scanner;
public class Question6
{

    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input num 1");
        int num1 = sc.nextInt();
        System.out.println("Input num 2");
        int num2 = sc.nextInt();
        System.out.println("Input num 3");
        int num3 = sc.nextInt();
        //using for loops
        int min = getSmallest(num1,num2,num3);
        System.out.println("the minimum is "+ min);
        //using math class
        int min2 = smallest(num1,num2,num3);
        System.out.println("the minimum is "+ min2);
    }

    //using for loops 
    public static int getSmallest(int x,int y,int z)
    {
        int min = x;
        if(min>y)
            min=y;
        else if(min>z)
            min=z;
        return min;
    }

    //using math class
    public static int smallest(int x,int y,int z)
    {
        return Math.min(x,Math.min(y,z));
    }
}
