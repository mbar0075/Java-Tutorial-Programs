
public class Transactions
{
   //-----------------------------------------------------------------
   //  Creates some bank accounts and requests various services.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Account acct1 = new Account ("Ted Mangion", 72354, 102.56);
      Account acct2 = new Account ("Jane Saliba", 69713, 40.00);
      Account acct3 = new Account ("Edward Debono", 93757, 759.32);

      acct1.deposit (25.85);

      double SalibaBalance = acct2.deposit (500.00);
      System.out.println ("Saliba balance after deposit: " +
                          SalibaBalance);

      System.out.println ("Saliba balance after withdrawal: " + 
                          acct2.withdraw (430.75, 1.50));

      acct1.addInterest();
      acct2.addInterest();
      acct3.addInterest();

      System.out.println ();
      System.out.println (acct1);
      System.out.println (acct2);
      System.out.println (acct3);
   }
}
