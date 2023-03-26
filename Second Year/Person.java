import java.util.*;
public class Person
{
    private  Scanner sc = new Scanner(System.in);
    private  String name,locality;
    private int age;
    
     public Person(String n,String l,int a){
       name=n;
       locality=l;
       age=a;
    }
    
    public String getName(){
        return name;
    }
    
    public String getLocality(){
        return locality;
    }
    
    public int getAge(){
        return age;
    }

}
