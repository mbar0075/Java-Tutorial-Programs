public class Rec_B_Search {
    public static void main (String args[])
    {
        // The values in the following array are sorted
      // in ascending order.
      int numbers[] = {101, 142, 147, 189, 199, 207, 222,
                       234, 289, 296, 310, 319, 388, 394,
                       417, 429, 447, 521, 536, 600};
        int searchValue = 417;               
      int result = binarySearch(numbers, 0, 
                               (numbers.length - 1),
                               searchValue);

         // Display the results.
         if (result == -1)
         {
            System.out.println(searchValue + 
                               " was not found.");
         }
         else
         {
            System.out.println(searchValue +
                               " was found at " +
                               "element " + result);
         }    
        }
                       
 public static int binarySearch(int[] array, int first,
                                  int last, int value)
   {
      int middle;     // Mid point of search
        
      // Test for the base case where the value is not found.
      if (first > last)
         return -1;
        
      // Calculate the middle position.
      middle = (first + last) / 2;
       
      // Search for the value.
      if (array[middle] == value)
         return middle;
      else if (array[middle] < value)
         return binarySearch(array, middle + 1,
                             last, value);
      else
         return binarySearch(array, first,
                             middle - 1, value);
   }
}