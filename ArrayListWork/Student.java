import java.util.*;
public class Student extends Person
{
    private String SID;

    public Student()
    {
    }
    
    public Student(String n , int y, String s)
    { 
        super(n,y);
        SID=s;
    }

    public String getStudentID(){
        return SID;       
    }
    
    public String toString(){
        return super.toString()+"  "+SID;  
    }
}
