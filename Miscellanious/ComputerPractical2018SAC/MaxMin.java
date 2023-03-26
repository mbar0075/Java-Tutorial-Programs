import java.util.*;
public class MaxMin{
    public static void main (String args []){
     Scanner sc = new Scanner(System.in);
     int num= 1;
     int max=Integer.MIN_VALUE;
     int min=Integer.MAX_VALUE; 
     do{
       System.out.println("Input a positive number \n press 0 to Quit");
       num = sc.nextInt();
       
       if(num>max)
            max=num;
       if(num!=0){     
       if(num<min)
            max=min;
        }  
     }
     while(num!=0);
     System.out.println("The largest number is " + max);
     System.out.println("The smallest number is " + min); 
    }
}