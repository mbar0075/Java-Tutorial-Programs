
// Java code to demonstrate the working of indexOf in ArrayList 
import java.util.ArrayList; 
  
public class IndexOfEx { 
  public static void main(String[] args) { 
       
  // creating an Empty Integer ArrayList 
  ArrayList<Integer> arr = new ArrayList<Integer>(5); 
  
  // using add() to initialize values 
  arr.add(1); 
  arr.add(2); 
  arr.add(3); 
  arr.add(4); 
  
  // printing initial value 
  System.out.print("The initial values in ArrayList are : "); 
  
  for (int k = 0; k < arr.size(); k++)  
  {
  System.out.print(arr.get(k)); 
  System.out.print(" "); 
  }   
  
  // using indexOf() to find index of 3 
  int pos =arr.indexOf(3); 
    
  // prints 2 
  System.out.println("\nThe element 3 is at index : " + pos); 
  } 
    
}    