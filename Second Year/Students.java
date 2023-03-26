import java.util.*;
public class Students
{
    private  Scanner sc = new Scanner(System.in);
    private String name ,surname;
    private  double pmark,tmark,average;

    public Students(){
        name = null;
        surname =null;
        pmark=0;
        tmark=0;
    }

    public void setName(String n){
        name=n;
    } 
    
    public void setSurname(String s){
        surname=s;
    } 
    
    public void setPmark(double p){
        pmark=p;
    } 
    
    public void setTmark(double t){
        tmark=t;
    } 

    public String  getName(){
        return name;
    }
    
    public String  getSurname(){
        return surname;
    }
    
    public double  getAverage(){
        average=(tmark+pmark)/2;
        return average;
    }
    
    public String  toString(){
        return name+" "+surname +"  got an average of  "+getAverage();
    }

}
