import java.util.*;
public class Q3
{
    static Scanner sc = new Scanner(System.in);
    private static int num[] =new int[10];
    private static int max=-10000;
    private static int min=10000;
    public static void main (String args[]){
        for(int i = 0; i<num.length;i++){
            System.out.println("Input num "+i);
            num[i]=sc.nextInt();
            if(num[i]<min)
            min=num[i];
            if(num[i]>max)
            max=num[i];
        }
        System.out.println("The maximum  is "+max);
        System.out.println("The minimum  is "+min);
    }
}
