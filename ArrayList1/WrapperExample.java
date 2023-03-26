
import java.util.* ;
class WrapperExample
{
  public static void main ( String[] args)
  {
    ArrayList<Integer> data = new ArrayList<Integer>();

    data.add( new Integer(1) );
    data.add( new Integer(3) );
    data.add( new Integer(17) );
    data.add( new Integer(29) );

    for ( int j=0; j < data.size(); j++ )
      System.out.print( data.get(j) + " " );
      
      System.out.println();
    // alternative loop using enhanced for loop
     for (Integer element : data)
      System.out.println(element);
      
//      for (int i=0; i< data.size(); i++)
//       {
//            System.out.println(data.get(i));
//         }
      
      // Java provides for automatic unboxing to the primitive types.
      // the following code uses unboxing to find the sum of the
      // elements 
      int sum = 0;
      for (int i=0; i< data.size(); i++)
      {
          sum += data.get(i);
        }
 
     int sum2 = 0;
     for (Integer element : data)
        sum2 += element;
        
        
        

    System.out.println( "Sum of numbers "+ sum);
     System.out.println( "Sum of numbers "+ sum2);
  }
}
