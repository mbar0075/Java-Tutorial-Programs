

public class RunnerArrayParameter
{
    
    public static void main (String args[])
    {
        int[] nums = new int[4];
        
        ArrayParameter ap = new ArrayParameter();
        
        ap.enterValues(nums);
        ap.displayValues(nums);
        ap.changeValues(nums);
        System.out.println();
          ap.displayValues(nums);
          int x = 4;
           System.out.println();
           System.out.println("value of number before calling method "+ x);
          ap.changeNumber(x);
            System.out.println("value of number after calling method "+ x);
            System.out.println("Value of x by using a getter "+ap.getX());
        
    }
}
