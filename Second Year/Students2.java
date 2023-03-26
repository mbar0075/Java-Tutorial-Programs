import java.util.*;
public class Students2
{
    private  Scanner sc = new Scanner(System.in);
    private String name ,subject;
    private  double pmark,tmark,average;

    public Students2(){
        subject="Computing";
    }
    
    public Students2(String n,double m1,double m2){
        name = null;
        subject="Computing";
        pmark=0;
        tmark=0;
    }

    public void setName(String n){
        name=n;
    } 
    
    public void setMarks(double m1,double m2){
        pmark=m1;
        tmark=m2;
    } 

    public double  calcAverage(){
        average=(tmark+pmark)/2;
        return average;
    }
    
    public void showDetails(){
        System.out.println(name+" "+subject +"  got "+tmark +"  "+pmark);
    }
    
    public String  toString(){
        return name+" "+subject +"  got "+tmark +"  "+pmark+" got the average of "+calcAverage();
    }

}
