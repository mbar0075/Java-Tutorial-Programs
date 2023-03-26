import java.util.*;
public class Employee
{
    private String name,surname;
    private int hrs;
    private double pay;
    private static String cname;

    public Employee()
    {
    }
    
    public Employee(String n, String s , int h, double p)
    {
        name=n;
        surname=s;
        hrs=h;
        pay=p;
    }

    public static void  setCompanyName(String c){
        cname=c;
    }
    
    public double getWage(){
        return pay*hrs;
    }
    
    public String toString(){
        return cname+"  "+name+"  "+surname+"  "+getWage();
    }
}
