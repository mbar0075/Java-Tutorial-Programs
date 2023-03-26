
import java.util.*;
public class Question1Average   {
public static void main(String[] args){
   
    int n = 0;
    int sum = 0;
    double average;
    boolean error;
    // Loop until there is no error
    do
    {
         Scanner scan = new Scanner(System.in);
      try
      {
          error = false; // Assume no error
          System.out.println("How many numbers do you want to enter to find their average?");
          n = scan.nextInt();
          if (n <= 0 ) throw new Exception("Number must be greater than 0.");
        }
        
         catch (InputMismatchException ex)
        {
            System.out.println("Input an integer ");
            
            error = true;
           
        }
        
        catch (Exception e) // Catch any exception and print the error message
        {
            error = true; // Set error flag if an exception occurs
           System.out.println(e.getMessage());
        }
    } while (error== true);
// Loop through each number and calculate the average
for (int i=0; i<n; i++)
{
  do
   {
       Scanner scan = new Scanner(System.in);
    try
    {
        error = false; // Assume no error
        System.out.println("Enter number " + (i+1));
        int num = scan.nextInt();
        sum += num;
    }
    
    catch (InputMismatchException ex)
        {
            System.out.println("Input an integer only ");
            
            error = true;
           
        }
    catch (Exception e)
    {
        // Set error flag if an exception occurs
        error = true;
        System.out.println("Error, please enter the number again.");
         }
    } while (error==true);
}
average = (double) sum / n;
System.out.println("\nThe average is " + average);
}
} 

