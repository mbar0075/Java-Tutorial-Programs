import java.util.*;
public class UsingWords1
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        
        Words1 w = new Words1();
        System.out.println("Input word");
        String word = sc.next();
        
        System.out.println("The word has "+w.getVowels(word)+"  vowels and   "+w.getConsonants(word)+"  consonants");
    }
}
