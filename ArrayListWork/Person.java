import java.util.*;
public class Person
{    
    protected String name;
    protected int yearOfBirth;
    public Person()
    {      
    }

    public Person(String n , int y)
    { 
        name = n;
        yearOfBirth = y;
    }

    public void setName(String n){
        name=n;        
    }

    public void setYearOfBirth(int y){
        yearOfBirth = y;        
    }

    public String getName(){
        return name;       
    }

    public int getyearOfBirth(){
        return yearOfBirth;       
    }

    public String toString(){
        return name+"   "+yearOfBirth;  
    }
}
