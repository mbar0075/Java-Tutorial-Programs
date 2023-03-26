
public class Array2D
{


/**
    * The showArray method accepts a two-dimensional 
    * int array and displays its contents. 
    */

   public  void showArray(int[][] array)
   {
      for (int row = 0; row < array.length; row++)
      {
         for (int col = 0; col < array[row].length; col++)
            System.out.print(array[row][col] + " ");
         System.out.println();
      }
   }

   /**
    * The arraySum method accepts a two-dimensional  
    * int array and returns the sum of its contents.
    */

   public int arraySum(int[][] array)
   {
      int total = 0;   // Accumulator

      for (int row = 0; row < array.length; row++)
      {
         for (int col = 0; col < array[row].length; col++)
            total += array[row][col];
      }

      return total;
   }
}