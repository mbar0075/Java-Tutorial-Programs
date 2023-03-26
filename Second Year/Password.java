import java.util.*;
public class Password
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        String password= "43tsM!ru3";
        
        System.out.println("input password");
        String input = sc.next();
        
        if((input.compareTo(password)==0))
            System.out.println("Welcome");
        else    
            System.out.println("Logged out ");
    }
}
