

public class multiply_by_addition
{
    public static int multiply(int a , int b)
    {
        if((a==0)||(b==0)) return 0;
        if(a==1) return b;
        else if (b==1) return a;
        else return a + multiply(a, b-1);
        
        
        
    }
    public static void main (String args[])
    {
        int ans = multiply(2,3);
        System.out.println(" 2 x  3 = " + ans);
        
        
    }
}
