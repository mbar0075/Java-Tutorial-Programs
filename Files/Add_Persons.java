
import java.io.*;
public class Add_Persons
{
    public static void main (String args[])  throws IOException {
    
        Person2[] people = new Person2[5];
     

        //setup the streams
        File               outFile  = new File("objects2.dat");
        FileOutputStream   outFileStream
                                    = new FileOutputStream(outFile);
        ObjectOutputStream outObjectStream
                                    = new ObjectOutputStream(outFileStream);
   
      // saving the size of the array first                               
       outObjectStream.writeInt(people.length);      
       
     for (int i = 0; i <people.length; i++) {
            people[i] = new Person2("Mr. Borg " + i, 20+i, 'M');
            outObjectStream.writeObject(people[i]);
        }
        
    }
    
}