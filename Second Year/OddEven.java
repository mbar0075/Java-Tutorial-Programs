import java.util.*;
public class OddEven
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        int num[]= new int[10];
        int odd=0,even=0;
        
        for ( int i =0; i<10;i++){
            System.out.println("Input num "+(i+1));
            num[i]= sc.nextInt();
            if((num[i]%2)==0)
                even++;
            else
                odd++;
        }
        System.out.println("There were  "+odd+"  odd numbers");
        System.out.println("There were  "+even+"  even numbers");
    }
}
