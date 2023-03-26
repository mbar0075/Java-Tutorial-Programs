import java.util.*;
public class Temperatures{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        ArrayList <Double> nums = new ArrayList <Double>();

        nums.add(40.0);
        nums.add(12.5);
        nums.add(36.0);
        nums.add(2.0);
        nums.add(-4.5);
        nums.add(20.4);

        System.out.println("Input tempretaure to search for ");
        double temp = sc.nextDouble();
        boolean found = false;
        int pos =-1;
        for(int i =0; i<nums.size();i++){
            if(temp==nums.get(i)){
                found = true;
                pos=i;
                System.out.println("Found in position "+pos);
            }
        }
        if ( found ==false)
            System.out.println("not found");

        Collections.sort(nums);
        for (double i : nums) {
            System.out.println(i);
        }
    }
}
    