
public class StringSort
{

    public static  String[] BSort(String[] str)
    {
        String temp;
        int count = str.length;
        //Sorting the strings
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) 
            { 
                if (str[i].compareTo(str[j]) > 0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        return str;
    }

    public static void main (String args[])
    {
        String [] arr = {"John", "Albert", "Victor", "Ray"};
        arr = BSort(arr);
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
