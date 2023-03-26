
import java.io.*;

class Read_Persons{

    public static void main (String[] args) throws ClassNotFoundException,
                                                   IOException {

        //setup file and stream
        File              inFile  = new File("objects2.dat");

        FileInputStream   inFileStream
                                  = new FileInputStream(inFile);

        ObjectInputStream inObjectStream
                                  = new ObjectInputStream(inFileStream);

        //read the Person objects from a file
             
       Person2 people;
        
       // since the size of the array is stored at the beginning of the file
       // the number of Person objects to read back is known.
       // N represents the number of Person objects
        int N = inObjectStream.readInt();
        
        for (int i = 0; i < N; i++) {
            people = (Person2) inObjectStream.readObject();

            System.out.println(people.getName() + "     " +
                               people.getAge()  + "     " +
                               people.getGender());
        }

        //input done, so close the stream
        inObjectStream.close();
   }
}