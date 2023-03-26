import java.util.*;
public class BoxPatternA{
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number1");
        int n = sc.nextInt();
        //program is incorrect
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n;j++){
                if((i==1)||(i==n)||(j==1)||(j==n))
                    System.out.print("*");
                 else
                    System.out.println("");
            }

        }
    }
}