public class savingsaccount extends Account
{
    private double interest , rate;

    public savingsaccount(int a , double r)
    {
        super(a);
        rate =r;
    }

    public void calculateinterest(){
        interest = balance*rate;
        balance+=interest;  
    }
}
