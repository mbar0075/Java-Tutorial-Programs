public class PartTime extends Employee
{
    private int hrsworked;

    public PartTime(String n , int s , int h)
    {
        super(n,s);
        hrsworked =h;
        fullTimeStaff = false;
    }

    public int getHoursWorked(){
       return hrsworked; 
    }
}
