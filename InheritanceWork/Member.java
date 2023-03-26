public class Member 
{
    protected String name;
    protected int number;
    protected String surname;
    protected int phone;
    
    public Member(String name,String surname,int number,int phone )
    {
        this.name=name;
        this.surname=surname;
        this.number=number;
        this.phone=phone;
    }

    public String toString(){
        return "Name  "+name+"\tSurname \t"+surname+"\tMembershipProgram \t"+number+"\tPhoneNumber \t"+phone;
    }
    
    public void ChangePhone(int phone){
        this.phone=phone;
    }
}
