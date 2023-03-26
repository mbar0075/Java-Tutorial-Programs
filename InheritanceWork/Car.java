public class Car extends Vehicle1
{
    private String fuel;

    public Car (Person theOwner, String brand, String mudel, String regno,String f_type) {
        super(theOwner,brand,mudel,regno);
        fuel=f_type;
    }

    public String toString(){
        return super.toString()+" \n"+fuel;
    }

    public void writeFuel(){
        System.out.println(fuel);
    }

    public void change_car_owner (Person owner){
        super.owner = this.owner;
    }
}
