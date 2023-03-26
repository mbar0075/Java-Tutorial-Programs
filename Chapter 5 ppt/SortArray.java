import java.util.Arrays;

class SortArray {
  public static void main(String args[]) {
	int nums[] = { 99, 10, 100123, 18, 978,
			   5623,  463,  -9,  287,  49 };
			  Arrays.sort(nums);
			  
			  // display the sorted array
		for(int i=0; i < 10; i++) {
			System.out.println(nums[i]);
			}
		}
}
