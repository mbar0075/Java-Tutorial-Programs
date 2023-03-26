
/**
 * This class demonstrates methods that accept a 
 * two-dimensional array as an argument.
 */

public class Use_Array2D
{
   public static void main(String[] args)
   {
      // Create a 2D array of integers.
      int[][] numbers = { { 1,  2,  3,  4  },
                          { 5,  6,  7,  8  },
                          { 9, 10, 11, 12  } };

      System.out.println("Here are the values in "
                         + "the array.");
       Array2D  test = new Array2D();                  
      // Pass the numbers array to the showArray method.
      // This will display the array's contents.
      test.showArray(numbers);

      // Display the sum of the array's values.
      // Note the call to the arraySum method, with the
      // array being passed as an argument.
      System.out.println("The sum of the values is "
                         + test.arraySum(numbers));
   }
}