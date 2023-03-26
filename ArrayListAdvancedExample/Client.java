import java.io.*;  

public class Client implements Serializable
{
    private String id, name, surname;
    
    public Client(String idIn, String nameIn, String surnameIn)
    {
        id = idIn;
        name = nameIn;
        surname = surnameIn;
    }
    
    public String getId()
    {
        return id;
    }
    
    public String toString()
    {
        return id+"  "+name+"  "+ surname;
    }
    
    
     public boolean equals( Object other )
  {
    return getId().equals( ((Client)other).getId() );
  }
    
    
    
}
