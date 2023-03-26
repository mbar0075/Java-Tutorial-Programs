public class CreateGame {
    int numOfWords = 5;
    String words[] = {"word" ,"length","cat","school","phone"};
    String word[] = new String[numOfWords];
    String[] hyphen;
    int currentWord = 0;
    
    //To calculate the amount of hyphens for words
    public void update() {
        hyphen = new String[words[currentWord].length()];
        for(int i = 0; i < words[currentWord].length(); i++) {
            hyphen[i] = "_";
        }
    }
    //to check whether the letter entered is correct or not
    public boolean GuessLetter(String input){
        boolean found = false;
        
        for(int i = 0; i < words[currentWord].length(); i++) {
            if(input.equals(String.valueOf(words[currentWord].charAt(i)))) {
                found = true;
                hyphen[i] = input;
            }
        }
        
        if(words[currentWord].equals(String.join(",", hyphen))) {
            currentWord++;
            update();
        }
        
        return found;
    }
    //to checkwhether the word entered was correct or not
    public boolean GuessWord(String input) {
        if(input.equals(words[currentWord])) {
            System.out.println("Correct\n");
            currentWord++;
            update();
            return true;
        } else {
            return false;
        }
    }
}
