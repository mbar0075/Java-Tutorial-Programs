import java.util.*;
public class otherClass
{
    String words[] = {"saber" ,"table","chair","fuzzy","phone"};
    Scanner sc = new Scanner(System.in);
    char hyphens[] = new char[5];
    char word[] = new char[5];
    char guess[] = new char[5];
    String wordu;   
    char guesss;
    int numOfWords = 5;
    String word1[] = new String[numOfWords];
    char[] dash;
    int currentWord = 0;
    int tries = 6;
    String input;

    void hyphen(){     
        if(currentWord<5){
            dash = new char[words[currentWord].length()];
            System.out.println("\nGuess the word ");

            for(int i = 0; i < words[currentWord].length(); i++) {
                dash[i] = '_';
                System.out.print(dash[i]);
            }
        }
    }

    void GuessChar(){
        boolean found = false; 

        do{   
            for(int i = 0; i<words[currentWord].length(); i++){ 
                word[i]=words[currentWord].charAt(i);  
            }

            for(int i = 0; i < words[currentWord].length(); i++){ 
                System.out.println();
                guesss = sc.next().charAt(0);
                guesss= Character.toLowerCase(guesss);
                for(int j = 0; j < words[currentWord].length(); j++){  
                    if(guesss==word[j]){  
                        dash[j]=word[j];
                        System.out.println("You are Correct");
                        System.out.print(new String(dash));
                        found=true;

                    }
                }
                if(found==false)
                    System.out.println("You are incorrect \nTry again \n tries:"+(--tries));
            }

            if(words[currentWord].equals(new  String((dash)))) {
                currentWord++;
                hyphen();                       
            } 

        } while ((tries>0)&&(currentWord<5));
    }
    void GuessWord(){
        do{
            for(int i=0; i< 5;i++){ 

                System.out.println("\nGuess the word");
                wordu = sc.nextLine();
                if(wordu.equalsIgnoreCase(words[currentWord])){
                    System.out.println("You are correct");
                    currentWord++;
                }
                else{
                    tries--;
                    System.out.println("You are incorrect \nTry again \n tries:"+tries);
                }
                if(tries!=0)
                    hyphen();
            }
        }while((tries>0)&&(currentWord<5));
    }
}
