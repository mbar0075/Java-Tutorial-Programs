public class Senior_Member extends Member 
{
    private String Senior;
    
    public Senior_Member(String Name,String Surname,int Number,int Phone)
    {
        super(Name,Surname,Number,Phone);
        Senior = "Senior";
    }

    public String toString(){
        return super.toString()+" \t"+Senior;
    }
    
}
