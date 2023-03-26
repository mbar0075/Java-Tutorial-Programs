
public class LinearSearch
{
    private int linearSearch(int[] arr, int value)
    {
        int return_value = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return_value = i;
                break;
            }
        }
        return return_value;
    }

    public static void main (String args[])
    {
        int[] arr = {3, 8, 9, 2, 1};
        LinearSearch linSearch = new LinearSearch ();
        int idx = linSearch.linearSearch(arr, 9);
        System.out.println(idx);
    }

}
