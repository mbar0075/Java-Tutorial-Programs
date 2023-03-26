public class Vehicle
{
    protected String reg_No,name;
    protected int year;
    protected double value;
    protected int year3=0;

    public Vehicle(String Reg,String Name,int Year,double Value)
    {
        reg_No=Reg;
        name=Name;
        year=Year;
        value=Value;
    }

    public String getReg_No(){
        return reg_No;
    }

    public String getName(){
        return name;
    }

    public int getYear(){
        return year;
    }

    public double getValue(){
        return value;
    }

    public void setValue(double Value){
        value=Value;
    }

    public int calculateAge(int year2){
        year3=year-year2;
        return year3;
    }

    public double calcdepreciation(int year2){
        int age = calculateAge(year2);
        for(int i=0;i<age;i++){
            value=value*0.9;
        }
        return value;
    }

}
