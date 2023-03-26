import java.util.Scanner;
public class Question2
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a postive number");
        int num = sc.nextInt();
        boolean Even = isEven(num);
        if(Even== true)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
    }

    public static boolean isEven(int input)
    {
        if((input%2)==0)
            return true;
        else
            return false;
    }
}
