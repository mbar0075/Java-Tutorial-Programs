
public class Truck extends Vehicle1
{
    private double load;
    private int tow;

    public Truck (Person theOwner, String brand, String mudel, String regno,double aLoad, int aTow){
        super(theOwner,brand,mudel,regno);
        load=aLoad;
        tow=aTow;
    }

    public String toString(){
        return super.toString()+" \n"+
        load+" \n"+
        tow;
    }

    public void writeLoad() {
        System.out.println(load);
    }

    public void writeTow(){
        System.out.println(tow);
    }

    public void setLoad(double newLoad){
        load=newLoad;
    }

    public void setTow(int newTow){
        tow=newTow;
    }

    public double getLoad(){
        return load;
    }
}
