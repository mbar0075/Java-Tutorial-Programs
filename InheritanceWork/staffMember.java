
abstract class staffMember
{
    protected String name;
    protected String address;
    protected String phone;
    
    
    public staffMember(String n,String a,String p)
    {
        name=n;
        address=a;
        phone=p;
    }

    public String toString(){
        return name+" \n "+address+" \n "+phone;
    }
    
    abstract double pay();
    
}
