import java.util.*;
public class Numbers3{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        ArrayList <Integer> nums = new ArrayList <Integer>();
        
        int temp =-1;
        do{
            System.out.println("Input number, enter 0 to quit");
            temp = sc.nextInt();
            if(temp!=0)
                nums.add(temp);
        } while(temp!=0);
        
        for (int i : nums) {
            System.out.println(i);
        }
        
        int total =0;
        int max =0;
        int min =1000;
        for(int i =0; i<nums.size();i++){
            total+=nums.get(i);
            if(max<nums.get(i))
                max=nums.get(i);
            if(min>nums.get(i))
                min=nums.get(i);    
        }
        double average =(double)( total)/nums.size();
        
        System.out.println("The total is "+total);
        System.out.println("The average is "+average);
        System.out.println("The highest number is "+max);
        System.out.println("The lowest number is "+min);
    }
}
 