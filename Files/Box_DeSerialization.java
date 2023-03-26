
// reading the objects saved previously
import java.io.*;
public class Box_DeSerialization
{
 public static void main (String[] args) throws ClassNotFoundException,
                                                   IOException {

        //setup file and stream
        File  inFile  = new File("box2.dat");

        FileInputStream  inFileStream = new FileInputStream(inFile);

        ObjectInputStream inObjectStream = new ObjectInputStream(inFileStream);
        
        Box b, b2;  // declaring two objects
        
        /*
         * the return value of readObject() is type Object so you have
         * to cast it back to the type you know it really is.
         */
        b = (Box)inObjectStream.readObject();
        b2 = (Box)inObjectStream.readObject();
        
        System.out.println(b.getHeight() + "    " + b.getWidth());
        System.out.println(b2.getHeight() + "    " + b2.getWidth());
        System.out.println(b);
        System.out.println(b2);
        
        inObjectStream.close();
    }
    
}
