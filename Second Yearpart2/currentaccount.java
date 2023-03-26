public class currentaccount extends Account
{
    
    public currentaccount(int a  )
    {
        super(a);
    }

    public void Limit(){
        if(balance==0)
            System.out.println("Surpassed overdraft limit");
        else
            System.out.println("Within overdraft limit");
    }
}
