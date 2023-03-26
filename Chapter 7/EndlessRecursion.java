
/**
   This class has a recursive method.
   it will call itself till a stack overflow occurs
*/

public class EndlessRecursion
{
   public static void message()
   {
      System.out.println("This is a recursive method.");
      message();
   }
}