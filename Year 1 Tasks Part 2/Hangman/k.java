import java.util.*;

public class k{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Choose between the following\n 1.GuessWord\n2.GuessChar");
     int choice = sc.nextInt();
     h obj = new h();
     switch (choice){
       case 1 :obj.GuessWord();
                break;
       case 2 :obj.GuessChar();
                break;
                
        }
 
    }
}