
class Bubble {
  public static void main(String args[]) {
	int nums[] = { 99, 10, 100123, 18, 978,
			   5623,  463,  -9,  287,  49 };
	int a, b, t;
	int size;
	int temp;
		
	size = 10; // number of elements to sort
	
// display original array
	
	System.out.print("Original array is:");
	for(int i=0; i < size; i++)
		System.out.print(" " + nums[i]);
	
		System.out.println();
		
	// this is the bubble sort
	
	for (t=0; t<size -1; t++)  //this loop for no of passes 
	   for (a=0; a < size-1; a++)  // loop for internal comparisons
		{
			if (nums[a] > nums[a+1])
			{
				temp 	 = nums[a];
				nums[a]  = nums[a+1];
				nums[a+1] = temp;
			}			
		}
			
	// display sorted array
	System.out.print("Sorted array is:");
		for(int i=0; i < size; i++)
			System.out.print(" " + nums[i]);
			System.out.println();	
		
	}
}

