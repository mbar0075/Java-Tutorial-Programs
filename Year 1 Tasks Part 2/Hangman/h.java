import java.util.*;
public class h{
    Scanner sc = new Scanner(System.in);
    String guess;
    int count = 8;
    int k =0;
    int numOfWords = 5;
    String words[] = {"word" ,"length","cat","school","phone"};
    String word[] = new String[numOfWords];
    String[] hyphen;
    int currentWord = 0;
    
    public void hyphens() {
        hyphen = new String[words[currentWord].length()];
        for(int i = 0; i < words[currentWord].length(); i++) {
            hyphen[i] = "_";
        }
    }
    void GuessWord(){
        for(int i=0;i<5;i++){
        do{
        System.out.println("Guess the word");
        guess =sc.nextLine();
        if(guess.equalsIgnoreCase(words[i])){
            System.out.println("You have guessed the word which is "+ words[i]);
            break;
        }
        else
            count--;
        }while(count!=0);
     }
    }
    void GuessChar(){
       for(int i=0;i<5;i++){ 
        
        }
    }
}