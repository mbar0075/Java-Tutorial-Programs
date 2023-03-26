import java.util.*;
public class Q5
{
    static Scanner sc = new Scanner(System.in);
    private static int input;
    private static int A[]= {0,1,3,4,5};
    private static int B[]= {10,20,30,100,2};
    private static int size;
    private static int count;
    public static void main (String args[]){
        size = A.length+B.length; 
        int C[]= new int[size];
        count=A.length;
        for(int i = 0; i<A.length;i++){
            C[i]=A[i];
        }
        for(int i = 0; i<B.length;i++){
            C[count+i]=B[i];
        }
        for(int i = 0; i<size;i++){
            System.out.print(C[i]+" ");
        }
    }
}
