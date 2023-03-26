
public class Student2 extends Person
{
   private String parentName;
   private String phone;
   private String classNo;
   
   public Student2 (String parentName, String phone, String classNo, String id, String name, String surname)
   {
       super(id, name, surname);
       this.parentName = parentName;
       this.phone = phone;
       this.classNo = classNo;
       
    }
    
    public void setParentName (String parentName)
    {
        this.parentName = parentName;
    }
    
    
    public String toString()
    {
        return super.toString() + parentName+"  "+ phone+ "   "+ classNo ;
    }
}
