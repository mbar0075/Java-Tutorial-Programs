//Matthias Bartolo - Il-bouncer tal-BC1B
import java.util.*;
public class Question4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n term of factorial");
        int num = sc.nextInt();
        System.out.println("\nc.Factorial");
        int factorial =1;
        for (int i = 1; i<=num;i++){
            factorial*=i;
        }
        System.out.println("The Factorial of " + num + " is " + factorial);
        if(factorial>1000)
            System.out.println("Greater then 1000");
        else
            System.out.println("Less than 1000");
    }
}