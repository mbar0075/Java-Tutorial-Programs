import java.util.*;
public class Customers
{
    private String ID,name,surname;

    public Customers()
    {
    }

    public Customers(String ID,String name ,String surname)
    {
        this.ID =ID;
        this.name=name;
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
    
    public void editID(String ID){
        this.ID=ID;
    }
    
    public void editName(String name){
        this.name=name;
    }
    
    public void editSurname(String surname){
        this.surname=surname;
    }
    
    public String toString(){
        return ID+"  "+name+"  "+surname;
    }
}
