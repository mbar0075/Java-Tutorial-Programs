
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Formatter;
import java.text.DecimalFormat;

public class StudentScoresFileIO
{
   public static void main( String[] args )
   {
      // declare and initialize variables
      int totalScore, scoreCount;
      int studentId1, studentId2 ;
      double score, avgScore;
      String studentLastName, studentFirstName;
      String outputStr = "";
      
       DecimalFormat formatter = new DecimalFormat("0.00");
      


      Scanner namesInput = null, scoresInput = null;

      File inStudentsFile  = new File( "studentNames.txt" ); // File objects
      File inScoresFile    = new File( "studentScores.txt" );
      File outFile         = new File( "averages2.txt" );
      FileWriter  aFileWriter  = null;
      PrintWriter aPrintWriter = null;

      try
      {
         namesInput   = new Scanner( inStudentsFile ); // Scanner objects
         scoresInput  = new Scanner( inScoresFile );

         aFileWriter  = new FileWriter( outFile ); // create pipeline
         aPrintWriter = new PrintWriter( aFileWriter ); // create valve

         while( namesInput.hasNext() )
         {
            totalScore = 0; // initialize for new student
            scoreCount = 0;
            avgScore   = 0;

            // input
            studentId1       = namesInput.nextInt();
            studentLastName  = namesInput.next();
            studentFirstName = namesInput.next();

            while( scoresInput.hasNext() )
            {
               // processing
               studentId2 = scoresInput.nextInt(); // get ID
               score = scoresInput.nextDouble(); // get score

               if( studentId2 == studentId1 ) // match student ID's
               {
                  totalScore += score;
                  scoreCount++;
               } // end if

            } // end inner loop

            avgScore = (double) totalScore / scoreCount;

            // add data to output string
                outputStr+=  (studentId1+" "+ studentLastName+"  "+
                          studentFirstName+"  "+ formatter.format(avgScore)+"\r\n" );            
                          
       // the \r the escape sequence of carriage return is added.  this code writes output
       // to a new line in a file, just as \n writes output to a new line on the screen.
            
              // reset scores scanner for new student
            scoresInput   = new Scanner( inScoresFile );

         } // end outer loop

         // output
         System.out.println( outputStr ); // print data to window

         aPrintWriter.print( outputStr ); // print data to file

      } // end try

      catch( FileNotFoundException e )
      {
         System.out.println( e.getMessage() );
         System.exit(1);
      }

      catch(IOException e)
      {
         System.out.println( e.getMessage() );
         System.exit(1);
      }

      finally
      {
         namesInput.close();
         scoresInput.close();
         aPrintWriter.close();
      }

   } // end main

} // end class