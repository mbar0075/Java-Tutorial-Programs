import java.util.*;
public class DeleteDuplicates
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ExceptionHandling e = new ExceptionHandling();
        SubClass s = new SubClass();
        
        System.out.println("Input Sentence:");
        String sentence = sc.nextLine();
        s.Delete(sentence);
    }
}
