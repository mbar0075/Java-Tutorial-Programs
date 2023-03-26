public class Student
{
    protected String name;
    protected String DOB;
    protected boolean type;

    public Student(String n , String d,boolean t)
    {
        name=n;
        DOB=d;
        type=t;
    }

    public boolean getType(){
        return type;
    }

    public String toString(){
        return name+"\t"+DOB; 
    }
}
