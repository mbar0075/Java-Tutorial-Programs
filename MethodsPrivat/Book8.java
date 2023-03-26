import java.util.*;
public class Book8
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
        int num[]= new int[51];
        for(int i= 0;i<51;i++){
            if((i%2)==0)
                num[i]=i;
        }
        for(int i= 0;i<=50;i++){
            if((num[i]!=0)||(i==0))
                System.out.println(num[i]);
        }
    }
}
