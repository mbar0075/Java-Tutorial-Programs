
public class Person
{
    private String name,surname;
    
    public Person(String n , String s)
    {
        name=n;
        surname=s;
    }

    public String getName(){
       return name; 
    }
    
    public String getSurname(){
       return surname; 
    }
    
    public String toString(){
       return name+"\t"+surname; 
    }
}
