
import java.io.File;
import java.util.Scanner;

public class OutputFileAccess
{
   public static void main( String[] args )
   {
       Scanner keyboard = new Scanner (System.in);
       System.out.println("Enter file name to search whether exists? ");
       String filename = keyboard.next();
       
         File outFile = new File(filename );
    //  File outFile = new File( "c:/averages.txt" );

      if ( outFile.exists() )
         System.out.println ( "Caution! The file " + outFile + " already exists." );
      else
         System.out.println ( "The file " + outFile + " does not yet exist." );
   } // end main

} // end class

