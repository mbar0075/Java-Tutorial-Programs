import java.util.*;
public class Numbers2
{

    public static void inputNums(int a[]){
        Scanner sc = new Scanner (System.in);
        for( int i =0 ; i<a.length;i++){
            System.out.println("Input num "+(i+1));
            a[i]=sc.nextInt();
        }
    }

    public static int findMax(int a[]){
        int max=-1;
        for( int i =0 ; i<a.length;i++){
            if(a[i]>max)
                max=a[i];
        }
        return max;
    }

    public static double calcAvg(int a[]){
        int sum =0;
        for( int i =0 ; i<a.length;i++){
            sum+=a[i];
        }
        double average =(double)(sum/a.length);
        return average;
    }

    public static int findOdd(int a[]){
        int count=0;
        for( int i =0 ; i<a.length;i++){
            if((a[i]%2)!=0)
                count++;
        }
        return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int [] array = new int[10];
        inputNums(array);

        System.out.println("The max is "+findMax(array));
        System.out.println("The average is "+calcAvg(array));
        System.out.println("There were this many odd numbers: "+findOdd(array));
    }
}
