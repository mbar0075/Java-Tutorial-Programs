import java.util.*;
public class Main
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=-1;
        do{
            System.out.println("Input integer");
            try{
                n = sc.nextInt();
            }
            catch(Exception e){
                System.out.println(e);
            }
            sc.nextLine();
        }while (n<=0);

        Computation comp = new Computation();
        double sum1 = comp.Harmonic(n);
        double sum2 = comp.Harmonic1(n);
        System.out.println("Recursion "+ sum1);
        System.out.println("Iteration "+ sum2);
    }
}
