import java.util.ArrayList;
public class Test
{
   public  static void main(String [ ] args)
    {
       ArrayList<String> nameList = new ArrayList<String> ();
       String [ ] names = {"Ann", "Bob", "Carol"};
       
       // Add to arrayList
       for (int k = 0; k < names.length; k++)
           nameList.add(names[k]);
       
       // Display name list
       for (int k = 0; k < nameList.size(); k++)
           System.out.println(nameList.get(k));        
       
    }   
}
