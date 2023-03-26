import java.util.*;
public class Question2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("a.Natural Numbers");
        System.out.println("Input n term of natural numbers");
        int num = sc.nextInt();
        int sum = 0;
        double avg = 0;
        for (int i = 0; i<=num;i++){
            System.out.print(i+" ");
            sum+=i;
        }
        avg = sum/num;
        System.out.println("\nThe sum of the numbers is "+ sum);
        System.out.println("\nThe average of the numbers is "+ avg);

        System.out.println("b.square");
        System.out.println("Input number");
        int n = sc.nextInt();
        for (int j = 0; j<n;j++){
            System.out.println("");    
            for (int i = 0; i<n;i++){
                System.out.print("*");  
            }
        }

        System.out.println("\nc.Factorial");
        int factorial =1;
        for (int i = 1; i<=num;i++){
            factorial*=i;
        }
        System.out.println("The Factorial of " + num + " is " + factorial);
    }
}