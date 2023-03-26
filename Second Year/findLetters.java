import java.util.*;
public class findLetters
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        String letter= "Supercalifragilisticexpialidocious";

        System.out.println("a."+letter.length());

        System.out.println("Input a letter");
        char input = sc.next().charAt(0);
        if(letter.indexOf(input)>0)
            System.out.println("The letter appeared at "+letter.indexOf(input));
        else 
            System.out.println("The letter does not appear");
    }
}
