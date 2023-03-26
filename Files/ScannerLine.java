
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

 class ScannerLine
{
   public static void main( String[] args ) throws FileNotFoundException
   {
      // declare and initialize variables
      int mark1, mark2, mark3;
      
     // input.useDelimiter("\n");
      Scanner LineInput = null;
      // input
      File inFile = new File( "results.txt" ); // locate data source

      // processing
      if( inFile.exists() )
      {
         // create Scanner object with file object as source
          LineInput = new Scanner( inFile );
          
       while (LineInput.hasNext() )
        {
		 mark1 = LineInput.nextInt();
		 mark2 = LineInput.nextInt();
		 mark3 = LineInput.nextInt();
		 System.out.println( mark1 + " "+ mark2+ " " + mark3 );
		double avg = (mark1 + mark2 + mark3)/3;
		System.out.println("Average "+ avg);
      }
    }
	  else
	  {
	    System.out.println( inFile + " does not exist" );
	    System.exit(0);
	  }
  
    
   } // end main

} // end class