/*Write a class which searches for a particular number in a constant
array having 7 elements and removes it from the array. To solve this problem use
two static methods, one to search and remove the element in the array and the other
to display the array elements.
 */
import java.util.*;
public class Exercise5
{
    private static Scanner sc = new Scanner(System.in);
    private static final int array[]={1,5,6,7,8,4,3};
    private static int input = 0;
    private static int n = array.length-1;

    public static void main(String args[]){
        Display(array,array.length);
        SearchRemove(array);

    }

    private static void SearchRemove(int[] arr)
    {
        System.out.println("Search for an element you wish to remove");
        input = sc.nextInt();
        for(int i=0;i<array.length;i++){
            if(input==array[i])
                array[i]=0;
            if(i!=(array.length-1)){    
                if(array[i]==0){
                    array[i]=array[i+1];
                    array[i+1]=0;
                }
            }
        }
        Display(arr,n);
    }

    private static void Display(int[] arr,int input)
    {
        for(int i=0;i<input;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
