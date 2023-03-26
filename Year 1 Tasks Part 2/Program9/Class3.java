
public class Class3
{
    private int rows = 8;
    public void DisplayColumn(int input,int[][] arr)
    {
        for(int i = 0; i<rows;i++){ 
            System.out.println(arr[i][input]);
        }
    }
}
