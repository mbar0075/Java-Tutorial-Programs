public class Hourly extends Employee
{
    private int hoursWorked;

    public Hourly(String n,String a,String p,String s,double pay)
    {
       super(n,a,p,s,pay);
       hoursWorked=0;
    }
    
    public void addHours(int moreHours){
       hoursWorked+=moreHours; 
    }
    
    public double pay(){
       return payRate*hoursWorked; 
    }
    
    public String toString(){
        return super.toString()+" \n "+hoursWorked;
    }
}
