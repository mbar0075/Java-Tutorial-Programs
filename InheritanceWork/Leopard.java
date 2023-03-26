public class Leopard extends Cat
{
    private int numSpots;

    public Leopard()
    {
        super(100);
        numSpots=0;
    }

    public Leopard(double w, int num){
        super(w);
        numSpots = num;
    }

    public void setNumSpots(int n){
        numSpots = n;
    }

    public void eat(){
        System.out.println("Crunch");
    }

    public double mealsPerDay(){
        return 2*mealsPerDay(); 
    }

    public String toString(){
        return super.toString()+ " The number of spots is "+numSpots;
    }
}
