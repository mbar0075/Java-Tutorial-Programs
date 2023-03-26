
public class Vehicle1
{
    protected String manufacturer,model,reg_no;
    protected Person owner;

    public Vehicle1 (Person theOwner, String brand, String mudel, String regno){
        owner =theOwner;
        manufacturer=brand;
        model=mudel;
        reg_no=regno;    
    }

    public String toString() {
        return owner+" \n"+
        manufacturer+" \n"+
        model+" \n"+
        reg_no;
    }

    public void writeOwnerName(){
        System.out.println(owner.name);
    }

    public void writeManufacturer(){
        System.out.println(manufacturer);
    }

    public void setOwner(Person newOwner){
        owner=newOwner;
    }

    public void setManufacturer(String newBrand){
        manufacturer=newBrand;
    }

    public String getOwnerName(){
        return owner.name;
    }

    public String getManufacturer(){
        return manufacturer;
    }

}
