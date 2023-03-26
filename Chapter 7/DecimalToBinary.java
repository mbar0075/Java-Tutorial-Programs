import java.util.*;

public class DecimalToBinary
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        int decimalNum;
        int base;

        base = 2;

        System.out.print("Enter a positive integer in "
                       + "decimal: ");
        decimalNum = console.nextInt();
        System.out.println();

        System.out.print("Decimal " + decimalNum + " = ");
        decToBin(decimalNum, base);
        System.out.println(" binary");
    }

    public static void decToBin(int num, int base)
    {
        if (num > 0)
        {
            decToBin(num / base, base);
            System.out.print(num % base);
        }
    }
}
