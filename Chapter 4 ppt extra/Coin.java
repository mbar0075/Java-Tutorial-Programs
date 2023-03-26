
public class Coin { 
   private final int HEADS = 0;  // tails is 1
   private int face;  // current side showing

   public void flip ()
   {
      face = (int) (Math.random() * 2);
   }

   public boolean isHeads ()
   {
       if (face == HEADS) return true;
       else return false;
   }

//    public String toString()
//    {
//        if (face == HEADS)return "Head";
//       else return "Tails";
//    }
}
