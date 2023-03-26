import java.util.*;
public class BinaryMethod
{

    public static void fillArray(int a[]){
        for( int i =0 ; i<a.length;i++){
            a[i]=(int)(Math.random()*100+1);
        }
    }

    public static void display(int a[]){
        for( int i =0 ; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
    public static void sort(int a[]){
        int n = a.length;
        for(int i=0;i<(n-1);i++){
            for(int j=0;j<(n-i);j++){
                if(j!=(n-1)){
                    if(a[j]>a[j+1]){
                        int temp = a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }           
        }
    }

    public static void search(int a[],int n){
        int check = Search(a,0,8,n);
        if(check==-1)
            System.out.println("Not found ");
        else
            System.out.println("found in location "+check);
    }
    
    public static int Search(int[] a, int first, int last, int key)
    {
        int result = 0;

        if (first > last)
            result = -1;
        else
        {
            int mid = (first + last)/2;

            if (key == a[mid])
                result = mid;
            else if (key < a[mid])
                result = Search(a, first, mid - 1, key);
            else if (key > a[mid])
                result = Search(a, mid + 1, last, key);
        }
        return result;
    }
}
