import java.util.*;
public class Array2DExercise
{
    private static Scanner sc = new Scanner(System.in);
    private static int[][] board ={{23,5,6,15,18},{4,16,24,67,10},{12,54,23,76,11},{1,12,34,22,8},{81,54,32,67,33}};
    private static int temp = board.length;
    private static int sumR[]=new int[temp];
    private static int sumC[]=new int[temp];
    private static int maxR[]=new int[temp];
    private static int maxC[]=new int[temp];
    private static int num;
    private static boolean found;

    public static void main(String args[]){
        System.out.println("1)Display");
        Display(board);
        SumRow(board);
        SumColumn(board);
        MaxRow(board);
        MaxColumn(board);
        Position(board);
    }

    private static void Display(int[][]array)
    {
        for(int r=0;r<board.length;r++){
            for(int c=0;c<board.length;c++){
                System.out.print(board[r][c]+"\t ");
            }
            System.out.println();
        }
    }

    private static void SumRow(int[][]array)
    {
        System.out.println("\n2)Sum of Rows");
        for(int r=0;r<board.length;r++){
            for(int c=0;c<board.length;c++){
                sumR[r]+=board[r][c];
            }
        }

        for(int i = 0; i<sumR.length;i++){
            System.out.println("Row "+i+" "+sumR[i]);  
        }
    }

    private static void SumColumn(int[][]array)
    {
        System.out.println("\n3)Sum of Columns");
        for(int r=0;r<board.length;r++){
            for(int c=0;c<board.length;c++){
                sumC[r]+=board[c][r];
            }
        }

        for(int i = 0; i<sumR.length;i++){
            System.out.println("Column "+i+" "+sumC[i]);  
        }
    }

    private static void MaxRow(int[][]array)
    {
        System.out.println("\n4)Largest number in rows");
        for(int r=0;r<board.length;r++){
            maxR[r]=board[r][0];
            for(int c=0;c<board.length;c++){
                if(maxR[r]<board[r][c])
                    maxR[r]=board[r][c];
            }
        }
        for(int i = 0; i<sumR.length;i++){
            System.out.println("Max "+i+" "+maxR[i]);  
        }
    }

    private static void MaxColumn(int[][]array)
    {
        System.out.println("\n5)Largest number in column");
        for(int r=0;r<board.length;r++){
            maxR[r]=board[0][r];
            for(int c=0;c<board.length;c++){
                if(maxR[r]<board[c][r])
                    maxR[r]=board[c][r];
            }
        }
        for(int i = 0; i<sumR.length;i++){
            System.out.println("Max "+i+" "+maxR[i]);  
        }
    }

    private static void Position(int[][]array)
    {
        int count=0;
        System.out.println("\n6)Position");
        System.out.println("Input number to search position for");
        num=sc.nextInt();
        for(int r=0;r<board.length;r++){
            found=false;
            for(int c=0;c<board.length;c++){
                if(num==board[r][c]){
                    System.out.println("Found in ["+r+"]["+c+"]");
                    found=true;
                    count++;
                }
            }
        }
        if((found==false)&&(count==0))
            System.out.println("Not found");
    }
}
