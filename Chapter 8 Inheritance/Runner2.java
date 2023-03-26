

   public class Runner2
{
    public static void main (String args[])
    {
        Customer firstCustomer =new Customer("Jones");
        GoldCustomer secondCustomer = new GoldCustomer("Cohen", 500);
       boolean ok1 = firstCustomer.dispatchGoods(98.76);
        if (ok1 == false)
              System.out.println("Order not given not enough money");
        else System.out.println("Order given ");
        boolean ok2 = secondCustomer.dispatchGoods(32.44);
          if (ok2 == false)
              System.out.println("Order not given not enough money");
        else System.out.println("Order given ");
      
    }
}
        
