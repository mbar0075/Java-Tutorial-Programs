import java.util.* ;

class Entry_Test
{
  public static void main ( String[] args)
  {
    ArrayList<Entry> phone = new ArrayList<Entry>();

    phone.add( new Entry( "Amy", "21415223") );
    phone.add( new Entry( "Bob", "21567834") );
    phone.add( new Entry( "Hal", "21234567") );
    phone.add( new Entry( "Deb", "21451675") );
    phone.add( new Entry( "Zoe", "21415890") );

    // Look for Hal in phone. The indexOf() method uses the
    // equals(Object) method of each object in the list.
    // 
    int spot = phone.indexOf( new Entry( "Hal", null ) ) ;

    System.out.println( "indexOf returns: " + spot ) ;
    
     System.out.println(phone.get(spot));
    
  }
}
