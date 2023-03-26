import java.util.*;
public class RemoveDuplicates
{   
    private Scanner sc = new Scanner(System.in);
    private int arr[] = {10,20,20,30,30,40,50,50};
    private static int temp[]=new int[5];

    public static void main(String args[]){
        int array[]= {10,20,20,30,30,40,50,50};
        int k=0;
        int n=removeDuplicateElements(array, k);
        System.out.println("Size of array "+n);
        display(array,n);
    }

    public static int removeDuplicateElements(int arr[],int n)
    {
        int count=0;
        for( int i=0; i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[count]=arr[i];
                count++;
            }
        }
        int size=temp.length;
        return size;
    }

    private static void display(int arr[],int n)
    {
        for( int i=0; i<n;i++){
            System.out.print(" " +temp[i]);  
        }
        System.out.println();
    }
}
