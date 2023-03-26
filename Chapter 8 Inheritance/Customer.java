
public class Customer
{
    protected String name;
    protected double totalMoneyPaid;  // total money paid so far by customer
    protected double totalGoodsReceived; /* value of total goods received
                                            so far by customer */
    public Customer(String nameIn)
    {
        name = nameIn;
        totalMoneyPaid = 0;
        totalGoodsReceived = 0;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getTotalMoneyPaid()
    {
        return totalMoneyPaid;
    }
    
    public double getTotalGoodsReceived()
    {
        return totalGoodsReceived;
    } 
    
    public double calculateBalance()
    {
        return totalMoneyPaid - totalGoodsReceived;
    }
    
    // record a payment made by the customer
    public void recordPayment(double paymentIn)
    {
        totalMoneyPaid = totalMoneyPaid + paymentIn;
    }
 
    // dispatch goods of a particular value to the customer
    public boolean dispatchGoods(double goodsIn)
    {
        if(calculateBalance() >= goodsIn)  // customer has sufficient funds
        {
           totalGoodsReceived = totalGoodsReceived + goodsIn;
           return true; // indicate success - goods should be dispatched
        }
        else
        {
           return false; // indicate failure - goods should not be dispatched                   
        }
    }
}

