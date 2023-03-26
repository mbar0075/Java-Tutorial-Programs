
public class Employee extends staffMember
{
    protected String socialSecurityNumber;
    protected double payRate;
    
    public Employee(String n,String a,String p,String s,double pay){
      super(n,a,p);
      socialSecurityNumber=s;
      payRate=pay;
    }
    
    public String toString(){
        return super.toString()+payRate+" \n "+socialSecurityNumber;
    }

    public double pay()
    {
         return payRate;
    }
}
