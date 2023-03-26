import java.util.Scanner;
public class Question3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Input String");
        String input = sc.next();
        boolean vowel ;
        char letter;
        int count=0;
        for(int i = 0;i<input.length();i++){
            letter=input.charAt(i);
            vowel = isVowel(letter); 
            if(vowel == true)
                count++;
        }
        System.out.println("There were "+ count + " vowels");
    }

    public static boolean isVowel(char letter)
    {
        letter =Character.toLowerCase(letter);
        switch (letter){
            case 'a':
            case 'e':
            case 'u':
            case 'i':
            case 'o':return true;
            //break;
            default:return false;
        }
    }
}
