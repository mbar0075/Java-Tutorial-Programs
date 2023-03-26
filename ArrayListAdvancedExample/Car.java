import java.io.*;  
class Car implements Serializable
{
    private String registration;
    private String make;
    private double price;
    private char sold;

    public Car(String registrationIn, String makeIn, double priceIn, char sold)
    {
        registration = registrationIn;
        make = makeIn;
        price = priceIn;
        this.sold = sold;
    }
    
    public char getSold()
    {
        return sold;
    }
    
    public String getRegistration()
    {
        return registration;
    }

    public String getMake()
    {
        return make;
    }

    public double getPrice()
    {
        return price;
    }
        
    public void setMake(String makeIn)
    {
        make = makeIn;
    }
        
    public void setPrice (double priceIn)
    {
        price = priceIn;
    }
        
    public String toString()
    {
        return registration + "  " + make + "   " + price + "  "+sold;
    }
    // to enable indexOf() to be used the method
    // equals must be overriden
    public boolean equals( Object other )
  {
    return getRegistration().equals( ((Car)other).getRegistration() );
  }
  
}


