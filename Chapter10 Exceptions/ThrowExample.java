
/* In this program we are checking the Student age
 * if the student age<12 and weight <40 then our program 
 * should return that the student is not eligible for registration.
 */
public class ThrowExample {
   static void checkEligibilty(int stuage, int stuweight){ 
      try{
       if(stuage<12 && stuweight<40) {
         throw new Exception("Student is not eligible for registration"); 
      }
      else {
         System.out.println("Student Entry is Valid!!"); 
      }
    }
      catch(Exception e)
        {
            String message = e.getMessage( );
            System.out.println(message);
            System.exit(0);
        }
   } 


   public static void main(String args[]){ 
     System.out.println("Welcome to the Registration process!!");
     checkEligibilty(10, 39); 
     System.out.println("Have a nice day.."); 
 } 
}
