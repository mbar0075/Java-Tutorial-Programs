
public class CountFlips   {
   //-----------------------------------------------------------------
   //  Flips a coin multiple times and counts the number of heads
   //  and tails that result.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int FLIPS = 2;
      int heads = 0, tails = 0;

      Coin myCoin = new Coin();  // creating an instance myCoin
// using this instance one can access all the methods in class Coin.

      for (int count=1; count <= FLIPS; count++)
      {
         myCoin.flip();
         
         System.out.println(myCoin);

         if (myCoin.isHeads())
            heads++;
         else
            tails++;
      }

      System.out.println ("Number of flips: " + FLIPS);
      System.out.println ("Number of heads: " + heads);
      System.out.println ("Number of tails: " + tails);
   }
}

