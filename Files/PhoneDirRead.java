
import java.io.*;
public class PhoneDirRead
{
    
 public static void main (String args[])
 {
    PhoneDir[] anotherArray = new PhoneDir[3];


        try
        {
            ObjectInputStream inputStream =
                 new ObjectInputStream(
                      new FileInputStream("array.dat"));
           anotherArray = (PhoneDir[])inputStream.readObject( );
           inputStream.close( );
        }
        catch(Exception e)
        {
            System.out.println(
                     "Error reading file array.dat.");
            System.exit(0);
        }

        System.out.println("The following were read\n"
                         + "from the file array.dat:");
        int i;
        for (i = 0; i < anotherArray.length; i++)
        {
            System.out.println(anotherArray[i]);
            System.out.println( );
        }
        System.out.println("End of program.");
        
        // comparing object in position 0 with that in position 1
        System.out.println("Object 0 & Object 1 are equal? "+anotherArray[0].equals(anotherArray[1]));
        System.out.println("Object 0 & Object 2 are equal? "+anotherArray[0].equals(anotherArray[2]));
    }
}