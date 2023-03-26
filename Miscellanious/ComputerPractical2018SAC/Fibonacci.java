import java.util.*;
public class Fibonacci{
    public static void main (String args []){
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Input how many numbers in the sequence");
     int n = sc.nextInt();
     int s1= 0;
     int s2 =1;
     int s3;
     for(int i= 1; i<=n;i++){
       
       if(i==1)
            System.out.print(s1+" ");
       else if(i==2)
            System.out.print(s2+" "); 
       else{
         s3=s2+s1;
         System.out.print(s3+" ");
         s1=s2;
         s2=s3;
        }
    }
    }
}