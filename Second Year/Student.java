import java.util.*;
public class Student
{
    private String ID,name,surname;

    public Student()
    {
    }
    
    public Student(String ID,String name , String surname)
    {
        this.ID = ID;
        this.name = name;
        this.surname=surname;
    }

    public String getID(){
        return ID;
    }
    
    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public String toString(){
      return name+"  "+surname+"  "+ID;  
    }
}
