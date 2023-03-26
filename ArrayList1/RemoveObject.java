
import java.util.*;  
public class RemoveObject
{ 
    public static void main(String[] args) 
    { 
        // Demonstrating remove on ArrayList 
        ArrayList<String>  myAlist = new ArrayList<String>(); 
        myAlist.add("George"); 
        myAlist.add("Paul"); 
        myAlist.add("Jane"); 
        System.out.println("Original ArrayList : " + myAlist); 
        myAlist.remove("Paul"); 
        System.out.println("Modified ArrayList : " + myAlist); 
        myAlist.add("Robert");
        myAlist.add("John");
        System.out.println("Adding two names ArrayList : " + myAlist); 
        myAlist.remove(2);  
        System.out.println("Modified ArrayList after removing : " + myAlist);
       // myAlist.removeAll(myAlist);
       // System.out.println("Modified ArrayList after removing : " + myAlist);
    }
}
