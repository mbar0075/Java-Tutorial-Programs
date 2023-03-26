public class X_Power_Y_Iterative
{
    public  int Power (int x, int y)
    {
        int product = 1;
        if (y ==0) return 1;
        else
        { for (int k = 1; k <=y; k++)
             product *= x;
            }
            
        return product;
    }
}
            