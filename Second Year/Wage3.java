import java.util.*;
public class Wage3
{
    private int hours;
    private double pRate,tRate,wage;

   
    public Wage3(int h,double p, double t)
    {
        hours = h;
        pRate=p;
        tRate=t;
    }
    
    public void setHours(int h){
        hours=h;
    }
    
    public void setPay(double p){
        pRate=p;
    }
    
    public void setTax(double t){
        tRate=t;
    }
    
    public int getHours(){
        return hours;
    }
    
    public double getPay(){
        return pRate;
    }
    
    public double getTax(){
        return tRate;
    }

    public double calcWage(){
        wage=hours*pRate-(hours*tRate);
        return wage;
    }
}
