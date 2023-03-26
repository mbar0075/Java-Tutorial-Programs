import java.util.*;
public class NumberUtil
{
    Scanner sc = new Scanner(System.in);
    private int factorial=1;
    //Part a
    public boolean Even(int x){
        if((x%2)==0)
            return  true;
        else
            return false;
    }
    //Part b
    public int getMaxOf(int x, int y){
        if(x>y)
            return x;
        else
            return y;        
    }
    //Part c
    public long getFactorial(int N){
        for(int i=1;i<=N;i++){
            factorial*=i; 
        }
        return factorial;
    }
}
