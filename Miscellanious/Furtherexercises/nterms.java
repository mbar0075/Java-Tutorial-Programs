import java.util.*;
public class nterms{
    public static void main (String args []){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input number of terms");
     int n = sc.nextInt();
     System.out.println("The odd numbers are:\n");
     int sum = 0;
     int count = 0;
     for(int i=0;i<=n;i++){
        if((i%2)!=0) {
         System.out.println(i);
         sum += i;
         n++;
        }
        
    }
    System.out.println("The sum is " + sum);
    }
}