import java.util.*;
import java.util.Scanner;
public class DanceLesson  {
    public static void main(String[] args)    {
        boolean error;
        int men=0, women=0;
    do {    
        Scanner keyboard = new Scanner(System.in);
         error = false;
     try {
        System.out.println("Enter number of male dancers:");
         men = keyboard.nextInt();

        System.out.println("Enter number of female dancers:");
         women = keyboard.nextInt();
    }
    
    catch (InputMismatchException ex)
        {
            System.out.println("Input an integer only ");
            
            error = true;
           
        }
        
      } while (error==true);
      
        try
        {
            if (men == 0 && women == 0)
                throw new Exception("Lesson is canceled. No students.");
            else if (men == 0)
                throw new Exception("Lesson is canceled. No men.");
            else if (women == 0)
                throw new Exception("Lesson is canceled. No women.");
       }
        catch(Exception e)
        {
            String message = e.getMessage( );
            System.out.println(message);
            System.exit(0);
        }

        System.out.println("Begin the lesson.");
    }

}

