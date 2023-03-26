
import java.util.*;
public class Arrays_Equal  {
  
  public static void main(String[] args)
  {
    int[] grades1 = {55,67,78,89,90,95};
    int[] grades2 = {55,67,78,89,90,95};
    int[] grades3 = {65,99,78,56,34,56};
    
    System.out.println("Array1 equals Array2 "+Arrays.equals(grades1, grades2));
    System.out.println("Array1 equals Array3 "+Arrays.equals(grades1, grades3));
  }
}
