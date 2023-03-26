
// reading the objects saved previously
import java.io.*;
public class Box_DeSerialization2
{
 public static void main (String[] args) throws ClassNotFoundException,
                                                   IOException {

        //setup file and stream
        File  inFile  = new File("box2.dat");
 try {  
        FileInputStream  inFileStream = new FileInputStream(inFile);

        ObjectInputStream inObjectStream = new ObjectInputStream(inFileStream);
        
        Box b  ;
        
        while (true)
        {
         try {      
        /*
         * the return value of readObject() is type Object so you have
         * to cast it back to the type you know it really is.
         */
        b = (Box)inObjectStream.readObject();
       
         }
        catch (EOFException eof) {
             System.out.println ("End of file");
            break;
         }
          System.out.println(b.getHeight() + "    " + b.getWidth());
         
        
        }  // while true     
    
        inObjectStream.close();
       }// end try
    
    catch (IOException e) {
      System.out.println("IO Exception =: "+ e);
    
          }// catch
          
     } // end main

} // end class      
          
          
          
