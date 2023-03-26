import java.util.*;
public class Runner
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        League l = new League();
        Display d = new Display(l);
        Sort s = new Sort(l);
        int array[][]= new int[4][5];
        System.out.println("Program 12 Football league\n");
        l.Input(array);
        
        d.Display(array);
        System.out.println();
        s.Sort(array);
        d.Display(array);
    }
}
