import java.util.*;
public class Book3MinMax
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
        int num[]= new int[10];
        int max=-100000 ;
        int min=100000;
        for(int i= 0;i<num.length;i++){
            System.out.println("Input num "+(i+1));
            num[i]=sc.nextInt();         
        }

        for(int i= 0;i<num.length;i++){
            if(min>num[i])
                min=num[i];   
            if(max<num[i])
                max=num[i];   
        }
        System.out.println("The max is "+ max);
        System.out.println("The min is "+ min);
    }
}
