import java.util.*;
import java.util.Scanner;
public class DanceLesson2  {
    public static void main(String[] args)    {
        boolean error;
        boolean menok=false;
        int men=0, women=0;
        do {    
            Scanner keyboard = new Scanner(System.in);
            error = false;
            try {
                if(menok==false){
                    System.out.println("Enter number of male dancers:");
                    men = keyboard.nextInt();
                    menok=true;
                }
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

    }
}

