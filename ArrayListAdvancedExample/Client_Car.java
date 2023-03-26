import java.io.*;  

public class Client_Car implements Serializable
{
    String id, reg_no;

    public Client_Car(String idIn, String reg_noIn)
    {
        id = idIn;
        reg_no = reg_noIn;
    }
    
    public String getReg()
    {
        return reg_no;
    }
    
    public String getId()
    {
        return id;
    }
    
    
    public boolean equals( Object other )
  {
    return getReg().equals( ((Client_Car)other).getReg() );
  }
}
