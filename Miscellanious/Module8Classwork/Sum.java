import java.util.*;
public class Sum {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Input 3 whole numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int total = n1+ n2 + n3;
        
        System.out.println("The total is " + total);
    }
}
