public class PartTimeStudent extends Student
{
    private int courses,fee;
    private boolean status;

    public PartTimeStudent(String name , String DOB ,boolean type,int courses)
    {
        super(name,DOB,type);
        this.courses=courses;
    }
    
    public int getFee(){
        return 150*courses;
    }
    
    public String getStatus(){
        if(status)
            return"Fee paid";
        else
            return"Fee not paid";
    }

    public String toString(){
        return super.toString()+"\t"+courses+"\t"+fee+"\t"+getStatus(); 
    }
}
