
import java.io.*;

public class PhoneDirOutput
{
  public static void main(String[] args)
  {
    PhoneDir[] oneArray = new PhoneDir[3];
    oneArray[0] = new PhoneDir("Peter Zammit", 21454545);
    oneArray[1] = new PhoneDir("James Vella", 21415298);
    oneArray[2] = new PhoneDir("Peter Zammit", 21454545);
    try
     {
       ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("array.dat"));
            outputStream.writeObject(oneArray);
            outputStream.close( );
        }
        catch(IOException e)
        {
            System.out.println("Error writing to file array.dat");
            System.exit(0);
        }
        
    }
}