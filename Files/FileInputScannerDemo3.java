
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

 class FileInputScannerDemo3   {
   public static void main( String[] args ) throws FileNotFoundException   {
      // declare and initialize variables
      String textLine;
      Scanner LineInput = null;
      // input
      File inFile = new File( "notes.txt" ); // locate data source

      // processing
      if( inFile.exists() ) {
         // create Scanner object with file object as source
          LineInput = new Scanner( inFile );
          
       while (LineInput.hasNext() )
       {
         textLine = LineInput.nextLine();
         System.out.println(textLine);
        }
        }
	  else
	  {
	    System.out.println( inFile + " does not exist" );
	  }
  
    
   } // end main

} // end class

