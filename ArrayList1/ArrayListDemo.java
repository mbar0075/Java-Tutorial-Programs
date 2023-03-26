
import java.util.*;
// ArrayList used ideally to search not add edit
// when adding & editing ideally you should use linked list
public class ArrayListDemo {
    public static void main (String args []) {
ArrayList<String> a = new ArrayList<String>();
        
        // add the items to the array list
        a.add("Charles");
        a.add("Paul");
        a.add("Marica");
        a.add("Joe");
        
        // remove one of them
        a.remove(1);
         System.out.println("Marica found in position "+ a.indexOf( "Marica" ) );
        
        // display the list using an iterator
        //iterator an object pointing to the head of the list
        // hasNext(boolean) a method within iterator
        // while not null checked by hasNext
        // next point to the next object
        // delete to delete an object       
        // Iterator is a class (interface) 
        // iterator a method that returns an object of 
        // type iterator pointing to the head of the list
        Iterator i = a.iterator();
       
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
