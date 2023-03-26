
import java.util.*;
public class Searching_Mark  {
  
  public static void main(String[] args)
  {
    int[] grades = {55,67,78,89,90,95};
    String entry;
    char myMark;
    int position;
    Scanner keyboard = new Scanner(System.in);
     System.out.println("Enter a mark to search for ");
    int num = keyboard.nextInt();
    
   position = Arrays.binarySearch(grades, num);
    if(position >= 0) System.out.println(num + " found in position "+position);
    else
       System.out.println(num + " not in the list");
    }
       
    }
