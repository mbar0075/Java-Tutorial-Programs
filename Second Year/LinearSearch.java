import java.util.*;
public class LinearSearch
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinearMethod l = new LinearMethod();
        System.out.println("Enter how many elements are needed");
        int size = sc.nextInt();
        int [] array = new int[size];

        l.fillArray(array);
        l.display(array);
        
        System.out.println("Input a number to search for");
        int num = sc.nextInt();
        l.linearSearch(array,num);

    }
}
