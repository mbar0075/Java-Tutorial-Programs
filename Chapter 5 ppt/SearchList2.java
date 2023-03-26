
import java.util.Scanner;
public class SearchList2
{
   public static void main(String[] args)
   {
      String[] deptName = {"Accounting", "Human Resources", "Sales"};
      String dept;
      int x;
      boolean deptWasFound = false;
      Scanner keyboard = new Scanner(System.in);
      keyboard.useDelimiter("\n");
     System.out.println("Enter a department name");
        dept = keyboard.next();
       
      for(x = 0; x < deptName.length; ++x)
         if(dept.equals(deptName[x]))
           deptWasFound = true;
      
       if(deptWasFound)
         System.out.println(dept+" was found in the list");
      else
           System.out.println( dept +" was not found in the list");
     
   }
}
