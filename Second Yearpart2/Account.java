public class Account
{
    protected double balance;
    protected int accountnumber;

    public Account(int a)
    {
        accountnumber=a;
        balance=0;
    }

    public void deposit(double b){
        balance+=b;  
    }

    public void withdrawal(double b){
        balance-=b;  
    }

    public String toString(){
        return accountnumber+" \t "+balance;
    }
}
