public class SecondHandVehicle extends Vehicle
{
    private int numberOfOwners;
    private boolean found;
    
    public SecondHandVehicle(String Reg,String Name,int Year,double Value,int num)
    {
      super(Reg,Name,Year,Value);  
      numberOfOwners=num;  
    }

    public int getNumberOfOwners(){
        return numberOfOwners;
    }
    
    public void IncrementOwners(){
        numberOfOwners++;
    }
    
    public boolean MultipleOwners(){
        found = false;
        if(numberOfOwners>1)found=true;
        return found;
    }
}
