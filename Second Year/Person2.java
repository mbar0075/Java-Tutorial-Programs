import java.util.*;
public class Person2
{
    private  Scanner sc = new Scanner(System.in);
    private  String name,surname;
    private int day,month,year,age;

    public Person2()
    {
    }

    public Person2(String n,String s,int d,int m,int y){
        name=n;
        surname=s;
        day=d;
        month=m;
        year=y;
    }

    public void setName(String n){
        name=n;
    }

    public void setSurname(String s){
        surname=s;
    }

    public void setDOB(int d, int m , int y){
        day=d;
        month=m;
        year=y;
    }

    public String toString(){
        return name+"  "+surname+" is "+age+"  years old and was born on "+day+"/"+month+"/"+year;
    }

    public int calcAge(int d, int m , int y){
        if((m<month)||(d<day)){
           age=y-year-1; 
        }
        else 
            age=y-year;
        return age;
    }

}
