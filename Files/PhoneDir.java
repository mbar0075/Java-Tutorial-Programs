
import java.io.*;
import java.util.*;

public class PhoneDir implements Serializable
{
    private String name;
    private int phone;
    
    public PhoneDir( )
    {
        name = null;
        phone = 0;
    }
   public PhoneDir (String isem , int numru)
   {
       name = isem;
       phone = numru;
    }

    public String toString()
    {
        return ("Name = " + name + "\n"
                 + "Phone = " + phone);
    }

    public void readInput( )
    {
        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter("\n");
        
        System.out.println("What is your friends name ?");
        name = keyboard.next( );

        System.out.println(name + " Phone number ");
         phone = keyboard.nextInt( );
    }


    public String getName( )
    {
        return name;
    }

    public int getPhone( )
    {
        return phone;
    }

  
    public void setName(String isem)
    { name = isem;}
    
    public void setPhone(int numru)
    { phone = numru;}
    
    
    public boolean equals(PhoneDir otherObject)
    {
     //   return ((name.equalsIgnoreCase(otherObject.name))
        //        && (phone == otherObject.phone));
                 
        if ( (name.equalsIgnoreCase(otherObject.name))
                && (phone == otherObject.phone)) return true;
        else return false;
                
    }
}
