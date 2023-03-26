import java.util.*;
public class Max
{
    private static int max1;
    private static double max2;

    public Max()
    {

    }

    public static int findMax(int a,int c , int b)
    {
        int temp=0;
        max1=a;
        if(b>c)
            temp=b;
        else 
            temp=c;
        if(max1<temp)
            max1=temp;
        return max1;
    }

    public static double findMax(double a,double c , double b)
    {
        double temp=0;
        max2=a;
        if(b>c)
            temp=b;
        else 
            temp=c;
        if(max2<temp)
            max2=temp;
        return max2;
    }

    public static void main(String args[]){
        System.out.println("Max of 54,89,14   "+findMax(54,89,14));
        System.out.println("Max of 32.5,1.23,8.45   "+findMax(32.5,1.23,8.45)); 
    }
}
