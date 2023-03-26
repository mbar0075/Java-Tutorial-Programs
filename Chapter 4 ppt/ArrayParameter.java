

public class ArrayParameter
{
    // passing an array means passing the array by reference
    // any changes will be passed back to the calling statement.
    int x;
    
    public void enterValues(int[] nums)
    {
        
     for(int k=0; k< nums.length; k++)
     {
         nums[k] = k;
        }
    }
    
    public void changeValues(int[] nums)
    {
        for(int k=0; k< nums.length; k++)
     {
         nums[k] = k*2;
        }
        
        
    }
    
    public void displayValues(int[] nums)
    {
        for(int k=0; k< nums.length; k++)
          System.out.print(nums[k]+ "  ");
        
    }

    // passing a primitive type variable doesn't pass back any changes
   
    public void changeNumber(int x)
    {
        this.x = x * 2;
        
    }
    
    public int getX()
    {
        return x;
    }
    
}
