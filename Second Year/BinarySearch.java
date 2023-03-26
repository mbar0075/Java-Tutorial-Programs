import java.util.*;
public class BinarySearch
{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        int num[]= {1, 2, 4, 8, 16, 32, 64, 128, 256};
        int size = num.length;

        System.out.println("Input number ");
        int input = sc.nextInt();
        int check = search(num,0,8,input);
        if(check==-1)
            System.out.println("Not found ");
        else
            System.out.println("found in location "+check);
    }

    public static int search(int[] a, int first, int last, int key)
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
                result = search(a, first, mid - 1, key);
            else if (key > a[mid])
                result = search(a, mid + 1, last, key);
        }
        return result;
    }

}
