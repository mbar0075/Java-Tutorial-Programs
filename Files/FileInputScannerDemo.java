
// FileInputScannerDemo.java

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

 class FileInputScannerDemo
{
   public static void main( String[] args ) throws FileNotFoundException
   {
      // declare and initialize variables
      int idNumber = 0;
      String lastName  = "", firstName = "";
      double testScore = 0.0;
     
      // input
      File inFile = new File( "scores.txt" ); // locate data source

      // processing
      if( inFile.exists() )
      {
         // create Scanner object with file object as source
         Scanner input = new Scanner( inFile );

		 idNumber  = input.nextInt();
		 lastName  = input.next();
		 firstName = input.next();
		 testScore = input.nextDouble();
      }
	  else
	  {
	    System.out.println( inFile + " does not exist" );
	    System.exit(0);
	  }

      // output
	  
    System.out.print( idNumber+"  "+ lastName+"  "+ firstName+"  "+ testScore );

} // end main
 
} // end class