public class Cat
{
    protected double weight;

    public Cat()
    {
        weight=10;
    }

    public Cat(double weight2)
    {
        weight=weight2;
    }

    public void setWeight(double w){
        weight=w;
    }

    public double getWeight(){
        return weight;
    }

    public void eat(){
        System.out.println("Slurp");
    }

    public double mealsPerDay(){
        return 2*weight/50; 
    }

    public String toString(){
        return " The weight  is "+weight;
    }
}
