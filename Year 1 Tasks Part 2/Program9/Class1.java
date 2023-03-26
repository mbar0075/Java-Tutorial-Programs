public class Class1
{
    private int rows = 8;
    private int columns = 5;
    private int temp;
    private boolean swap=true;

    public void getSort(int[][] arr) { 
        System.out.println("UnSorted:");
        for(int i = 0; i<rows;i++){
            for(int j = 0; j<columns;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        while(swap==true){
            for(int c = 0; c<columns;c++){
                swap=false;
                for(int r = 0; r<(rows-1);r++){
                    if(arr[r][c]>arr[r+1][c]){
                        temp = arr[r][c];
                        arr[r][c]=arr[r+1][c];
                        arr[r+1][c]=temp;
                        swap = true;
                    }
                }
            }
        }

        System.out.println("Sorted:");
        for(int i = 0; i<rows;i++){
            for(int j = 0; j<columns;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
