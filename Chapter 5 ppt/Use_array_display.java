
import java.util.*;
public class Use_array_display
{
  public static void main(String[] args)
  {
    int[] myScores = new int[5];
    array_display ad = new array_display();
    ad.display("Original array:             ", myScores);
    Arrays.fill(myScores, 8);
    ad.display("After filling with 8s:      ", myScores);
    myScores[2] = 6;
    myScores[4] = 3;
    ad.display("After changing two values:  ", myScores);
    Arrays.sort(myScores);
    ad.display("After sorting:              ", myScores);
  }
}