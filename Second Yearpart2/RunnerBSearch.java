import java.util.*;
public class RunnerBSearch
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int nums[] =new int [20];
        
        for( int i = 0 ; i<nums.length;i++){
           nums[i]= (int)(Math.random()*101+0); 
        }
        int n = nums.length;
        for(int i=0;i<(n-1);i++){
            for(int j=0;j<(n-i);j++){
                if(j!=(n-1)){
                    if(nums[j]>nums[j+1]){
                        int temp = nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                }
            }           
        }
        for( int i = 0 ; i<nums.length;i++){
           System.out.print(nums[i]+" ");
        }
        System.out.println("\nInput number to search for");
        int key = sc.nextInt();
        
        BinarySearch bs = new BinarySearch();
        int first = 0;
        int last = 19;
        int value = bs.search(nums, first, last, key);
        if (value == -1) System.out.println("The number "+key +" not in List");
        else System.out.println("The number "+ key + " is found in position "+ value);
        
        
    }
}
