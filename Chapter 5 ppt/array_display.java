
public class array_display
{
public  void display(String message, int[] array)
  {
    int sz = array.length;
    System.out.print(message);
    for(int x = 0; x < sz; x++)
      System.out.print(array[x] + " ");
    System.out.println();
  }
}
