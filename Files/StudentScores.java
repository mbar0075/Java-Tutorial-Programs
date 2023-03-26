
/*
 * Purpose:  Perform file input to average test scores using Scanner class
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Formatter;
import java.text.DecimalFormat;

public class StudentScores
{
   public static void main( String[] args )
   {
      // declare and initialize variables
      int    totalScore, scoreCount;
      int    studentId1, studentId2 ;
      double score, avgScore;
      String studentLastName, studentFirstName, newRecord;
      String outputStr = "Average scores for students:\n\n";
   
      DecimalFormat formatter = new DecimalFormat("0.00");
      
      Scanner namesInput = null, scoresInput = null;

      File inStudentsFile  = new File( "studentNames.txt"  ); // File objects
      File inScoresFile    = new File( "studentScores.txt" );

      try
      {
         namesInput  = new Scanner( inStudentsFile ); // Scanner objects
         scoresInput = new Scanner( inScoresFile );

         while( namesInput.hasNext() )
         {
            totalScore = 0; // initialize for new student
            scoreCount = 0;
            avgScore   = 0;

            // input
            studentId1       = namesInput.nextInt();
            studentLastName  = namesInput.next();
            studentFirstName = namesInput.next();

            while(scoresInput.hasNext())
            {
               // processing
               studentId2 = scoresInput.nextInt(); // get ID
               score = scoresInput.nextDouble();   // get score

               if( studentId2 == studentId1 )      // match student ID's
               {
                  totalScore += score;
                  scoreCount++;
               } // end if

            } // end inner loop

            avgScore = (double) totalScore / scoreCount;

            // add data to output string
            //outputStr += String.format
              //           ( formatStr, studentId1, studentLastName,
                //          studentFirstName, avgScore );
                          
            outputStr+=  (studentId1+" "+ studentLastName+"  "+
                          studentFirstName+"  "+ formatter.format(avgScore)+"\n" );            
                          
            // reset scores scanner for new student
            scoresInput   = new Scanner( inScoresFile );

         } // end outer loop

         // output
         System.out.println( outputStr ); // print data

      } // end try

      catch( FileNotFoundException e )
      {
         System.err.println( e.getMessage() );
         System.exit(1);
      }

      finally
      {
         namesInput.close();
         scoresInput.close();
      }

   } // end main

} // end class