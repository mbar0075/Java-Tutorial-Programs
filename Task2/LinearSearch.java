import java.util.*;
public class LinearSearch
{
    //Part a.
    private static int linearSearch(int[]array,int value)
    {
        int position=-1;
        for(int i=0;i<array.length;i++){
            if(value==array[i])
                position=i;
        }
        return position;
    }

    public static void main(String args[]){
        int intArray[]={3,8,9,2,1};
        int num=9;

        int posi=linearSearch(intArray,num);
        if(posi==-1)
            System.out.println("Not found");
        else
            System.out.println("Found at "+posi);
    }
}
