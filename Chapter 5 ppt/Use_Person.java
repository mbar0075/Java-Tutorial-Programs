
      public class Use_Person
{
    public static void main (String args[])
    {
        Person [] p = new Person[3];
        
       Person persuna = new Person();
       persuna.enter_details(p);
   
        persuna.display_persons(p);
        
        int position = persuna.search_persons(p);
        if (position >-1)
            System.out.println(persuna.getName()+" found in position "+ position);
        else System.out.println(persuna.getName()+" not found");
    }
}  
