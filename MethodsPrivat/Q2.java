import java.util.*;
public class Q2
{
    static Scanner sc = new Scanner(System.in);
    private static int sum;
    private static int num[] =new int[10];
    public static void main (String args[]){
        for(int i = 0; i<num.length;i++){
            System.out.println("Input num "+i);
            num[i]=sc.nextInt();
            sum+=num[i];
        }
        System.out.println("The sum is "+sum);
    }
}
