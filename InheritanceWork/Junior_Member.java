public class Junior_Member extends Member
{
    private String Junior;
    
    public Junior_Member(String Name,String Surname,int Number,int Phone)
    {
        super(Name,Surname,Number,Phone);
        Junior="Junior";
    }

    public String toString(){
        return super.toString()+" \t"+Junior;
    }
    
}
