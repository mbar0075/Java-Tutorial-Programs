import java.util.*;
public class Printing
{
    //Part a.
    public void  printArray(int[]array)
    {
        int n= array.length;
        for(int i= 0 ; i<n;i++){
            System.out.print(array[i]+" , ");  
        }
        System.out.println();
    }
    //Part b.
    public void  printArray(double[]array)
    {
        int n= array.length;
        for(int i= 0 ; i<n;i++){
            System.out.print(array[i]+" , ");  
        }
        System.out.println();
    }

    public void  printArray(char[]array)
    {
        int n= array.length;
        for(int i= 0 ; i<n;i++){
            System.out.print(array[i]+" , ");  
        }
        System.out.println();
    }
}
