import java.util.*;
public class BubbleSort
{
    //Question 2 
    //Part b. Declaring of variables
    private static int numArray[] = {9,4,7,1,3};
    private static float floatArray[]={3.2f,1.7f,44.3f,22.9f,17.4f};

    //Question 1
    private static int[] bubbleSort(int[] array)
    {
        int n= array.length;
        for(int i=0;i<(n-1);i++){
            for(int j=0;j<(n-i);j++){
                if(j!=4){
                    if(array[j]>array[j+1]){
                        int temp = array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }
            }           
        }
        return array;
    }
    //Question 2
    //Part a. Method overloading
    private static float[] bubbleSort(float[] array)
    {
        int n= array.length;
        for(int i=0;i<(n-1);i++){
            for(int j=0;j<(n-i);j++){
                if(j!=4){
                    if(array[j]>array[j+1]){
                        float temp = array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }
            }           
        }
        return array;
    }
    //Question 2 
    //Part c. Testing
    public static void main(String args[]){
        numArray=bubbleSort(numArray);
        floatArray=bubbleSort(floatArray);
        //Printing of results
        for(int i=0;i<numArray.length;i++){
            System.out.print(numArray[i]+" , ");  
        }
        System.out.println();
        for(int i=0;i<floatArray.length;i++){
            System.out.print(floatArray[i]+" , ");  
        }
    }
}
