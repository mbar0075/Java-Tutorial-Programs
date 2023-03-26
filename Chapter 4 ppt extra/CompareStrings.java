
import java.util.Scanner;
public class CompareStrings
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
       keyboard.useDelimiter("\n");
       String aName = "Carmen";
      String anotherName;
      System.out.println("Enter name to compare ");
      anotherName = keyboard.next();
      
     if(aName.equals(anotherName))
            System.out.println( aName +" equals " + anotherName);
      else
          System.out.println( aName +" does not equal " + anotherName);
      
   }
}

