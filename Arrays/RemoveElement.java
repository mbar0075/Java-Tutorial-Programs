import java.util.*;
public class RemoveElement
{   
    private Scanner sc = new Scanner(System.in);
    private int []array = new int [10];
    private int pos=-1;
    private int input;

    public  void input()
    {
        for( int i=0; i<array.length;i++){
            System.out.println("Input number "+(i+1)); 
            array[i]= sc.nextInt(); 
        }
    }

    public  int search_no()
    {
        pos=-1;
        System.out.println("Input number to search for ");
        input = sc.nextInt();
        for( int i=0; i<array.length;i++){
            if(input==array[i]){
                pos=i;
                System.out.println("Number found in position "+pos);
                break;
            }
        }
        return pos;
    }

    public  void remove_no()
    {
        pos=search_no();
    }

    public  void display()
    {
        for( int i=0; i<array.length;i++){
            if(i!=pos)
                System.out.print(" " +array[i]);  
        }
        System.out.println();
    }
}
