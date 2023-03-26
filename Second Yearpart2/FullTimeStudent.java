public class FullTimeStudent extends Student
{
    private String address;
    private int telephone;

    public FullTimeStudent(String name , String DOB ,boolean type,String address,int telephone)
    {
        super(name,DOB,type);
        this.address=address;
        this.telephone=telephone;
    }

    public String toString(){
        return super.toString()+"\t"+address+"\t"+telephone; 
    }
}
