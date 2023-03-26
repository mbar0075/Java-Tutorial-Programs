import java.util.*;
public class Numbers1
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        int array[]= new int[20];
        int sum=0;
        int max =0;
        int min=10000;
         
        for ( int i =0; i<20;i++){
            array[i]=(int)(Math.random()*100+1);
            System.out.println(array[i]);
            sum+=array[i];
            if(array[i]>max)
                max=array[i];
            if(array[i]<min)
                min=array[i];
        }
        double average =(double)(sum/20);
        System.out.println("The average is "+average);
        System.out.println("The highest number is "+max);
        System.out.println("The lowest number is "+min);
    }
}
