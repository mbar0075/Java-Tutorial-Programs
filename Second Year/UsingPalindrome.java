import java.util.*;
public class UsingPalindrome
{
    public static void main( String args[]){
        Palindrome p = new Palindrome();
        Scanner sc = new Scanner (System.in);
        System.out.println("Input word");
        String word = sc.next();
        boolean found = p.Check(word);
        if(found==true)
            System.out.println("The word is a palindrome");
        else 
            System.out.println("Not a palindrome");
        }
}
