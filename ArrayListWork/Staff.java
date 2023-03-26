import java.util.*;
public class Staff extends Person
{
    private String StaffRoom;

    public Staff()
    {
    }
    
    public Staff(String n , int y, String s)
    { 
        super(n,y);
        StaffRoom=s;
    }
    
    public void setRoom(String s){
        StaffRoom =s;       
    }

    public String getRoom(){
        return StaffRoom;       
    }
    
    public String toString(){
        return super.toString()+"  "+StaffRoom;  
    }
    
    public boolean equals(Object Other){
        return getRoom().equals((((Staff)Other).getRoom()));
    }
}