
class Entry
{
  private String name;
  private String number;

  // constructor
  Entry( String n, String num )
  {
    name = n; number = num;
  }

  // methods
  public String getName()
  {
    return name ;
  }

  public String getNumber()
  {
    return number ;
  }

  public boolean equals( Object other )
  {
    return getName().equals( ((Entry)other).getName() );
  }

  public String toString()
  {
    return "Name: " + getName() + "; Number: " + getNumber() ;
  }
 
}
