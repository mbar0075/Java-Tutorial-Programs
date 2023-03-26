import java.util.Scanner;
public class Question1
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input num 1");
        int num1 = sc.nextInt();
        System.out.println("Input num 2");
        int num2 = sc.nextInt();
        int sum = getTotal(num1,num2);
        System.out.println("The sum is "+ sum);
    }

    public static int getTotal(int x,int y)
    {
        return x + y;
    }
}
