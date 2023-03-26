
import java.util.*;
// ArrayList used ideally to search not add edit
// when adding & editing ideally you should use linked list
public class ArrayListDemo2 {
	public static void main (String args []) {
		
		ArrayList<String> a = new ArrayList<String>();
		// add the items to the array list
		a.add("Charles");
		a.add("Paul");
		a.add("Marica");
		a.add("Joe");
		a.add(0,"Ray"); //add in first position
		
		// remove one of them
		a.remove(1);
		a.remove("Paul"); // removes "Paul" if exists
				
		Iterator i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		// displaying an item in a particular position
		System.out.println( a.get(0));
	
		// replace an item in a particular position	
		a.set(0,"Sarah");
		System.out.println( a.get(0));
		
		// appending another ArrayList with ArrayList "a"
		ArrayList<String> b = new ArrayList<String>();
		b.add("Tom");
		b.add("Jerry");
		b.add("Pluto");
		
		a.addAll(b);
		
		Iterator j = a.iterator();
		while (j.hasNext()) {
			System.out.println(j.next());
		}
	}
}
