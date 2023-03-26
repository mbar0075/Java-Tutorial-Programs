class Car
{
    private String registration;
    private String make;
    private double price;

    public Car(String registrationIn, String makeIn, double priceIn)
    {
        registration = registrationIn;
        make = makeIn;
        price = priceIn;
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
        return registration + "  " + make + "   " + price;
    }
    // to enable indexOf() to be used the method
    // equals must be overriden
    public boolean equals( Object other )
  {
    return getRegistration().equals( ((Car)other).getRegistration() );
  }
  
}


