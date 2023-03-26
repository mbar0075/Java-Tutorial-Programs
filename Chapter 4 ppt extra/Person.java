
import java.util.Scanner;
public class Person
{
   private String name;
   private int age;
    String temp;
   
   Person()
   {}
   
   Person (String nameIn, int ageIn)
   {
       name = nameIn;
       age = ageIn;
    }
    
    public void enter_details(Person[] personarray)
    {
        Scanner keyboard = new Scanner (System.in);
        for (int i =0; i < personarray.length; i++)
          {
              System.out.println("Enter name ");
              name = keyboard.next();
              System.out.println("Enter age ");
              age = keyboard.nextInt();
              personarray[i] = new Person(name,age);
            }
        }
        
        
        public void display_persons (Person[] personarray)
        {
             for (int i =0; i < personarray.length; i++)
            System.out.println(personarray[i]);
        }
        
        public String toString()
        {
            return name + "  " + age;
        }
        
        
        public int search_persons(Person[] personarray)
        {
               Scanner keyboard = new Scanner (System.in);
                int pos=-1 ;
            System.out.println("Name to search ");
            temp = keyboard.next();
            
             for (int i =0; i < personarray.length; i++)
                if(personarray[i].name.equals(temp))
                { boolean found = true;
                    pos = i;
                }
                   return pos;
                   
                }
                
        public String getName()
        {
            return temp;
        }
        
    }
