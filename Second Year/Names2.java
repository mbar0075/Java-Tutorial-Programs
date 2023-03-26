import java.util.ArrayList;
public class Names2{
    public static void main (String args[]){
        ArrayList <String> names = new ArrayList <String>();
        
        names.add("Anthony");
        names.add("Claire");
        names.add("Eric");
        names.add("Henry");
        names.add("Walter");
        
        names.remove("Eric");
        names.remove(2);
        names.add("Bob");
        names.add(names.indexOf("Anthony")+1, "Valerie");
        System.out.println("Walter is in location "  + names.indexOf("Walter"));
        System.out.println("The size of the array list is "  + names.size());
        
         for(String i: names)
             System.out.println(i);        
    }
}