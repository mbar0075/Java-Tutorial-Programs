import java.util.*;
public class GuessTheNumber
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        int num= (int)(Math.random()*10+1);
        int guess;
        for(int i=0;i<3;i++){
            System.out.println("Input guess "+(i+1));
            guess= sc.nextInt();
            if(guess==num)
                i=3;
        }
        System.out.println("The number is "+num);
    }
}
