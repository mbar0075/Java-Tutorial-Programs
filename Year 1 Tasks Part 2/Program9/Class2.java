
public class Class2
{
    private int rows = 8;
    private int columns = 5;
    private boolean found = false;
    private int count;
    public void getSearch(int[][] arr,int input) { 
        count=0;
        for(int i = 0; i<rows;i++){
            found = false;
            for(int j = 0; j<columns;j++){
                if(input==arr[i][j]){
                    System.out.println("Found in location "+i+","+j);  
                    found=true;  
                    count++;
                }
            }
            if(rows==8)
                found=true;

        }
        if((found==false)||(count==0))
            System.out.println("Not found"); 
    }
}
