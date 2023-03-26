import java.util.*;
public class Tax
{
    private static Scanner sc = new Scanner(System.in);
    private static double income,Tax;
    private static char status;

    public static void main( String args[]){
        System.out.println("Input income gained in a year");
        income = sc.nextDouble();
        System.out.println("Input status M if married and s if single");
        status = sc.next().charAt(0);
        status = Character.toUpperCase(status);
        if(status=='M')
            Tax=taxMarried(income);
        if(status=='S')
            Tax=taxSingle(income);
        System.out.println("The Tax is "+Tax);
    }

    private static double  taxMarried(double income){
        Tax=income*0.14;
        return Tax;
    }

    private static double  taxSingle(double income){
        Tax=income*0.2;
        return Tax;
    }
}
