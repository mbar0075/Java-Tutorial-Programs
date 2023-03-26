
// FileInputScannerDemo.java

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

 class FileInputScannerDemo2
{
   public static void main( String[] args ) throws FileNotFoundException
   {
      // declare and initialize variables
      int idNumber = 0;
      String lastName  = "", firstName = "";
      double testScore = 0.0;
     
      Scanner LineInput = null;
      // input
      File inFile = new File( "scores.txt" ); // locate data source

      // processing
      if( inFile.exists() )
      {
         // create Scanner object with file object as source
          LineInput = new Scanner( inFile );
          
       while (LineInput.hasNext() )
        {
		 idNumber  = LineInput.nextInt();
		 lastName  = LineInput.next();
		 firstName = LineInput.next();
		 testScore = LineInput.nextDouble();
		 System.out.println( idNumber+"  "+ lastName+"  "+ firstName+"  "+ testScore );
      }
    }
	  else
	  {
	    System.out.println( inFile + " does not exist" );
	    System.exit(0);
	  }
  
    
   } // end main

} // end class