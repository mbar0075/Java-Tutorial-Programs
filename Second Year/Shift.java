import java.util.*;
public class Shift
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        int array[]= new int[5];

        for ( int i =0; i<5;i++){
            array[i]=(int)(Math.random()*100+1);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for ( int i =0; i<4;i++){
            int swap = array[i+1];
            array[i+1]=array[i];
            array[i]=swap;            
        }

        for ( int i =0; i<5;i++){
            System.out.print(array[i]+" ");
        }
    }
}
