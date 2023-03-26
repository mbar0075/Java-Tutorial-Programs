import java.util.*;
public class PrimeNumber{
    public static void main (String args []){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input a positive number");
     int num = sc.nextInt();
     int total = 0; 
     boolean f = true;
     for (int i= 1;i<=num;i++){ 
      if((num%i)!=0){
       f=false;
       break;
    }
     
    }
    if(f==false)
      System.out.println("num " +num+ " is not a prime number");
      else
      System.out.println("num " +num+ " is   a prime number");
    }
}