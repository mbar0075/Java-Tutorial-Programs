import java.util.*;
public class Q6
{
    static Scanner sc = new Scanner(System.in);
    private static int input;
    private static int A[]= {0,10,3,4,5};
    private static int B[]= {20,9,30,100,2};
    private static int size;
    private static int count;
    private static int temp;
    public static void main (String args[]){
        size = A.length+B.length; 
        System.out.println("The size of the array "+size);
        int C[]= new int[size];
        count=A.length;
        //merge
        for(int i = 0; i<A.length;i++){
            C[i]=A[i];
        }
        for(int i = 0; i<B.length;i++){
            C[count+i]=B[i];
        }
        for(int i = 0; i<size;i++){
            System.out.print(C[i]+" ");
        }
        System.out.println();
        //sort
        int n= size-1;
        //ghamel naqra ta dry run
        for(int i = 0; i<(n-1);i++){//passes
            for(int j = 0; j<n-i;j++){
                if(C[j]>C[j+1]){
                    //only this is correct approach temp is always num[j] and not num[j+1]
                    temp=C[j];
                    C[j]=C[j+1];
                    C[j+1]=temp;
                }
            }
        }
        for(int i = 0; i<size;i++){
            System.out.print(C[i]+" ");
        }
    }
}
