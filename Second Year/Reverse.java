import java.util.*;
public class Reverse
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        int array[]= new int[15];
        int reverse[]= new int[15];
        int count=14;
         
        for ( int i =0; i<15;i++){
            array[i]=(int)(Math.random()*100+1);
            System.out.println(array[i]);
        }
        System.out.println("\n reverse");
        for ( int i =0; i<15;i++){
            reverse[i]=array[count];
            count--;
            System.out.println(reverse[i]);
        }
    }
}
