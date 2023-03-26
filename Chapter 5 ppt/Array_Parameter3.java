public class Array_Parameter3  {
// this method multiplies the array contents by 2
    public void Change_Array (int[] list)
    {
        for (int i = 0; i < list.length; i++ )
          list[i] = list[i] * 2;
      }
         
    public void printArray (int[] list)
    {
        int index;
        System.out.println();
        for (index = 0; index < list.length; index++)
        System.out.print(list[index]+ "  ");
    }
}
