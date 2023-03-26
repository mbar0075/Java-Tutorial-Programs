import java.util.*;
public class Prices
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        double array[][]= new double[5][20];
        double max =0;
        double min =1000;

        System.out.println();
        for ( int i =0; i<5;i++){
            for ( int j =0; j<20;j++){
                array[i][j]=Math.random()*100+1;
                if(array[i][j]>max)
                    max=array[i][j];
                if(array[i][j]<min)
                    min=array[i][j];
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("The max is "+max);
        System.out.println("The min is "+min);
    }
}
