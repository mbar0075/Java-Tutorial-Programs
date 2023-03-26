import java.util.*;
public class Swap
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        int array[]= new int[5];

        for ( int i =0; i<5;i++){
            array[i]=(int)(Math.random()*100+1);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int swap = array[4];
        array[4]=array[3];
        array[3]=swap;

        for ( int i =0; i<5;i++){
            System.out.print(array[i]+" ");
        }
    }
}
