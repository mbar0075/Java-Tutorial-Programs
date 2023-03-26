import java.util.*;
public class Sum{
    public static void main (String args []){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input number 1");
     int n1 = sc.nextInt();
     System.out.println("Input number 2");
     int n2 = sc.nextInt();
     int sum = n1+n2;
     System.out.println("The sum is "+sum);
     int diff=0;
     int distance;
     if(n1>n2)
        diff=n1-n2;
     else
        diff=n2-n1;
     System.out.println("The difference is " + diff);
     System.out.println("The product is " +(n1*n2));
     System.out.println("The average is " + (sum/2));
     if(n1>n2)
        System.out.println("The number " + n1 + " is the largest");
        else
        System.out.println("The number " + n2 + " is the largest");
     if(n1>n2)
        System.out.println("The number " + n2 + " is the smallest");
        else
        System.out.println("The number " + n1 + " is the smallest");   
     
    System.out.println("The distance between the numbers is  " + diff);
    }
}