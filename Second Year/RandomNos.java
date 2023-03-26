import java.util.*;
public class RandomNos
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        int array[][]= new int[4][5];
        int array2[] ={1,2,3,4,5};
        int count[]= new int [5];

        System.out.println();
        for ( int i =0; i<4;i++){
            for ( int j =0; j<5;j++){
                array[i][j]=(int)(Math.random()*5+1);
                for ( int k =0; k<5;k++){
                    if(array[i][j]==array2[k])
                        count[k]++;
                }
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        
        int max = count[0];
        int pos=0;
        for ( int k =1; k<5;k++){
            if(count[k]>max){
                max=count[k];
                pos=k;
            }
        }
        
        System.out.println("The most frequent number is "+array2[pos]+" which appeared "+count[pos]+" times");
    }
}
