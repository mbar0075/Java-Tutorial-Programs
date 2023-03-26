import java.util.Scanner;
  public class Array{
	public static void main (String args[]){
		
	    Scanner Keyboard = new Scanner(System.in);
	// declaring an array of 10 String items
	
	String names[] = new String[10];

	//Initialising the array
	for (int i =0;i<10;i++)
		names[i] = "";

	//Filling up the array
	for (int i=0;i<10;i++){ 
		System.out.println("Enter a name");
		names[i] = Keyboard.next();
	}
	//Searching in the array
	boolean found = false;
	System.out.println("Enter the name to search for");
	String n = Keyboard.next();
	for (int i=0;i<10;i++){
		if (names[i].equals(n)) {
			found =true;
			System.out.println("Found in location :"+i);
		}
	}
	if (found == false)
		System.out.println("Name not found");

	//Listing the contents of the array	
	for (int i=0;i<10;i++)
		System.out.println(names[i]);
	     }
    	} 
