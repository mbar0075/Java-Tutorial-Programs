
public class Employee // the class is declared abstract
{
 protected String number;
 protected String name;
 
 public Employee(String numberIn, String nameIn)
 {
     number = numberIn;
     name = nameIn;
 }

 public void setName(String nameIn)
 {
      name = nameIn;
 }

 public String getNumber()
 {
     return number;
 }

 public String getName()
 {
     return name;
 }

 public String toString()
 {
     return getName()+ "   "+ getNumber();
}
}