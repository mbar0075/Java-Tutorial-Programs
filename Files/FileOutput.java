
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class FileOutput
{
   public static void main( String[] args ) throws IOException
   {
      double average = 95.0;
      String aLineOfData = "The average score is " + average;
      String aSecondLine = "This is an extra line ";

      File outFile = new File( "average3.txt" ); // locate data destination
      FileWriter aFileWriter   = new FileWriter( outFile,true ); // create pipeline
      PrintWriter aPrintWriter = new PrintWriter( aFileWriter ); // create valve
      aPrintWriter.println( aLineOfData ); // open valve
      aPrintWriter.println( aSecondLine);  // open valve
      
      
      aPrintWriter.close(); // close valve
   } // end main

} // end class