public class FullTime extends Employee
{
    private double salary;

    public FullTime(String n , int s , double y)
    {
        super(n,s);
        salary=y;
        fullTimeStaff = true;
    }

    public double getYearlySalarly(){
       return salary; 
    }
}
