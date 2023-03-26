import java.util.*;
public class hangman {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        CreateGame c = new CreateGame();
        
        int tries = 1;
        int currentWord = c.currentWord;
        c.update();
        
        
        do {
            for(int i = 0; i < (c.hyphen).length; i++) {
                System.out.print(c.hyphen[i]);
            }
            
            System.out.print("\n\n1.Guess a letter \n2.Guess the word\n3.Quit ");
            String input = s.next().toUpperCase();
            System.out.println();
            
            String input2;
            boolean correctGuess = false;
            if(input.equals("3")) {
                System.out.print("Goodbye");
                break;
            }
            if(input.equals("1")) {
                
                System.out.print("Guess Letter > ");
                input2 = s.next().toLowerCase();
                System.out.println();
                
                correctGuess = c.GuessLetter(input2);
            } else if(input.equals("2")) {
                
                System.out.print("Guess Word > ");
                input2 = s.next().toLowerCase();
                System.out.println();
                
                correctGuess = c.GuessWord(input2);
            } else {
                System.out.println("Invalid");
                System.out.println();
                tries--;
            }
            
            if(!correctGuess) {
                tries++;
            }
            
            System.out.println("Tries: " + (8 - tries) + "\n");
            
        } while(tries <= 7);
    }
}