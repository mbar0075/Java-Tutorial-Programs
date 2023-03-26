
import java.util.* ;

class Entry_Test2
{
  public static void main ( String[] args)
  {
    ArrayList<Entry> phone = new ArrayList<Entry>();

    phone.add( new Entry( "Amy", "21415223") );
    phone.add( new Entry( "Bob", "21567834") );
    phone.add( new Entry( "Hal", "21234567") );
    phone.add( new Entry( "Deb", "21451675") );
    phone.add( new Entry( "Zoe", "21415890") );

    String name;
    Scanner scan = new Scanner( System.in );

    System.out.print("Enter name to search or quit to stop -->");
    name = scan.next();

    while( !name.equals("quit" ) )
    {
      int spot = phone.indexOf( new Entry( name, null ) ) ;

      if ( spot >= 0 )
        System.out.println( phone.get( spot ) ) ;
      else
        System.out.println( name + " not found" ) ;

      System.out.print("Enter name -->") ;
      name = scan.next();
    }

  }
}
