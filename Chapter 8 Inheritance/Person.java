
public class Person  {
   protected String name;
   protected String surname;
   protected String id;
   
   public Person (String id, String name, String surname)
   {
       this.id = id;
       this.name = name;
       this.surname = surname;
    }
            public void setName (String name)
    {
         this.name = name;
    }
    
    public void setSurName (String surname)
    {
         this.surname = surname;
        }
        
        public String toString()
    {
        return name + "  "+ surname;
    }
    
    
    public String getId()
    {
        return id ;
    }
    
    public boolean equals( Object other )
  {
    return getId().equals( ((Person)other).getId() );
  }
    
}

