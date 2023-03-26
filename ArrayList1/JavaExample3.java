
import java.util.*;  
class JavaExample3{  
  public static void main(String args[]){  
     ArrayList<String> alist=new ArrayList<String>();  
     alist.add("George Cassar");  
     alist.add("Keith Drago");  
     alist.add("Charles Lafaro");  
     alist.add("Sandra Cutajar"); 
     alist.add("Tyron Borg");
  
     //iterating ArrayList
     for (int k = 0; k < alist.size(); k++)
           System.out.println(alist.get(k));     
     
      
     }  
}