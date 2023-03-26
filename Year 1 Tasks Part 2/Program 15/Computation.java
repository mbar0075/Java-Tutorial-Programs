import java.util.*;
public class Computation
{
    private double average=0;
    private int sum=0;
    private char display='E';
    private int[] array;
    private int count=0;

    public void ShowAverage(int[]result){
        for(int i = 0;i<result.length;i++){
            if(result[i]==0)
                count++;
            sum+=result[i];
        }
        if(count==0)
            Average(average);
        else
            Average();
    }

    public void Average(double average){
        System.out.println("\nThe average of the numbers is "+average);    
    }

    public void Average(){
        System.out.println(display);
        System.out.println("\nThe average of the numbers is "+average);    
    }
}
