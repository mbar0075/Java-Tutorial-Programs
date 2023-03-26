import java.util.*;
public class Factorial
{
    private int num;

    public Factorial()
    {
    }

    public void  setNumber(int n){
        num=n;
    }
    
    public int  getNumber(){
        return num;
    }
    
    public int  calcFactorial(){
        int f=1;
        for( int i=1;i<=num;i++){
            f*=i;
        }
        return f;
    }
}
