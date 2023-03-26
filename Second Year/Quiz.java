import java.util.*;
public class Quiz
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        String answer= "Valleta";
        
        System.out.println("What is the capital city of Malta");
        String input = sc.next();
        
        if(input.equalsIgnoreCase(answer))
            System.out.println("Well done");
        else    
            System.out.println("Answer incorrect , the correct answer is "+answer);
    }
}
