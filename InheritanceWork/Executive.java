public class Executive extends Employee
{
    private double bonus;


    public Executive(String n,String a,String p,String s,double pay)
    {
       super(n,a,p,s,pay);
       bonus = 0;
    }

    public void awardBonus(double execBonus)
    {
      bonus = execBonus;
    }
    
    public double pay(){
       return payRate+bonus; 
    }
}
