
import java.io.*;
public class Box_Serializable
{
   public static void main (String args[])
   {
       Box myBox = new Box();
       Box myBox2 = new Box();
       Box myBox3 = new Box();
       
       myBox.setWidth(50);
       myBox.setHeight(20);
       
       myBox2.setWidth(40);
       myBox2.setHeight(70);
   
        myBox3.setWidth(10);
        myBox3.setHeight(30);
       
       
       try  // I/O operations can throw exceptions 
       {
           // connect to a file named "box.dat" if it exists. if it 
           // doesn't make a new file named "box.dat"
           FileOutputStream fs = new FileOutputStream ("box2.dat");
           ObjectOutputStream os = new ObjectOutputStream (fs);
           // make an ObjectOutputStream chained to the connection stream
           // tell it to write the object
            os.writeObject(myBox);
           os.writeObject(myBox2);
            os.writeObject(myBox3);
           os.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        
    }
}
           