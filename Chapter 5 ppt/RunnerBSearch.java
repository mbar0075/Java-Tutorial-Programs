

public class RunnerBSearch
{
    public static void main (String args[])
    {
        int nums[] = { 1, 3, 5, 7, 9, 11, 13};
        
        BinarySearch bs = new BinarySearch();
        int first = 0;
        int last = 6;
        int key = 7;
        int value = bs.search(nums, first, last, key);
        if (value == -1) System.out.println("The number "+key +" not in List");
        else System.out.println("The number "+ key + " is found in position "+ value);
        
        
    }
}
