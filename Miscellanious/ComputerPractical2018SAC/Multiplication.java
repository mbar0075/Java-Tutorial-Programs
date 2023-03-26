import java.util.*;
public class Multiplication{
    public static void main (String args []){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input a positive number");
     int num = sc.nextInt();
     int total = 0;   
     for (int i= 1;i<=10;i++){ 
      total=num*i;   
     System.out.println("num *" +i+ " = "+ total);  
    }
    }
}