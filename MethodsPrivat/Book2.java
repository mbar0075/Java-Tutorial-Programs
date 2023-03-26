import java.util.*;
public class Book2
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
        int num[]= new int[10];
        int total=0 ;
        double average=0;
        for(int i= 0;i<num.length;i++){
            System.out.println("Input num "+(i+1));
            num[i]=sc.nextInt();
            total+=num[i];          
        }
        average =total/num.length;
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);
        for(int i= 0;i<num.length;i++){
            if(average>num[i])
                System.out.println(num[i] + " location "+(i+1));    
        }
    }
}
