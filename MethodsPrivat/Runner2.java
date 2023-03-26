import java.util.*;
public class Runner2
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        League2[] lg = new League2[4];
        League2 l = new League2();
        
        l.inputServices(lg);
        
        l.show(lg);
        l.sort(lg);
        System.out.println();
        l.show(lg);
    }
}
