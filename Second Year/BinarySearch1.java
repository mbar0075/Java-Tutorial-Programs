import java.util.*;
public class BinarySearch1
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BinaryMethod b = new BinaryMethod();
        System.out.println("Enter how many elements are needed");
        int size = sc.nextInt();
        int [] array = new int[size];

        b.fillArray(array);
        System.out.println("Unsorted:");
        b.display(array);
        b.sort(array);
        System.out.println("Sorted:");
        b.display(array);
        
        System.out.println("Input a number to search for");
        int num = sc.nextInt();
        b.search(array,num);

    }
}
