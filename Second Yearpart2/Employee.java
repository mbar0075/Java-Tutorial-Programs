public class Employee
{
    protected String name;
    protected int staffno;
    protected boolean fullTimeStaff;

    public Employee(String n , int s)
    {
        name = n;
        staffno=s;
    }

    public String toString(){
        return name+"\t"+staffno+"\t"+fullTimeStaff;
    }
}
